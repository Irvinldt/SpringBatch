package com.example.demo.batch.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.repository.WkfNtfCampaniaRepository;

@Component
public class LecturaCampania implements Tasklet{

	@Autowired
	WkfNtfCampaniaRepository wkfNtdCampaniaRepo;
	
	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
//		List<WkfNtfCampania> lista = new ArrayList<WkfNtfCampania>();
//		
//		if (!wkfNtdCampaniaRepo.findAll().isEmpty()) {
//			System.out.println("Entro");
//		}
//			lista = wkfNtdCampaniaRepo.findAll();
//			System.out.println(wkfNtdCampaniaRepo.findAll());
//			for (WkfNtfCampania wkfNtfCampania : lista) {
//				System.out.println("Lista: " + wkfNtfCampania.toString());
//			}
//			return RepeatStatus.FINISHED;
//		}
//		
		System.out.println("PASO");
		
		
		return RepeatStatus.FINISHED;
	}
}
