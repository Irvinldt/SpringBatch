package com.example.demo.batch.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.batch.tasklet.LecturaPlantilla;
import com.example.demo.domain.CustomItemWriter;
import com.example.demo.domain.WkfNtfCampania;
import com.example.demo.domain.WkfNtfCampaniaModelMapper;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	@Autowired
	private DataSource dataSource;

	@Bean
	public JdbcCursorItemReader<WkfNtfCampania> reader() {
		JdbcCursorItemReader<WkfNtfCampania> cursorItemReader = new JdbcCursorItemReader<>();
		cursorItemReader.setDataSource(dataSource);
		cursorItemReader.setSql(
				"SELECT id_campania, nombre, descripcion, fecha_inicio, fecha_fin, id_frecuencia, remitente, destino, estado FROM wkf_ntf_campania WHERE estado = '1'");
		cursorItemReader.setRowMapper(new WkfNtfCampaniaModelMapper());
		
		return cursorItemReader;
	}

	@Bean
	public CustomItemWriter writer() {
		return new CustomItemWriter();
	}

	@Bean
	public Step step1() {
		return stepBuilderFactory.get("step1").<WkfNtfCampania, WkfNtfCampania>chunk(10).reader(reader())
				.writer(writer()).build();
//		return stepBuilderFactory.get("step1")
//                .tasklet(new LecturaCampania())
//                .build();
	}
	
	@Bean
    public Step step2(){
        return stepBuilderFactory.get("stepTwo")
                .tasklet(new LecturaPlantilla())
                .build();
    } 

	@Bean(name="demoJobOne")
	public Job testJob() {
//		return jobBuilderFactory.get("jobName").incrementer(new RunIdIncrementer()).flow(step1()).end().build();
		return jobBuilderFactory.get("demoJobOne")
                .start(step1())
                .next(step2())
                .build();
	}

}
