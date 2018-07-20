package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repository.WkfNtfPlantillaCampaniaRepository;
import com.example.demo.repository.WkfNtfPlantillaRepository;

public class CustomItemWriter implements ItemWriter<WkfNtfCampania> {

	@Autowired
	WkfNtfPlantillaCampaniaRepository plantillaCampaniaRepo;

	@Autowired
	WkfNtfPlantillaRepository plantillaRepo;

	@Override
	public void write(List<? extends WkfNtfCampania> obj) throws Exception {

		if (!obj.isEmpty()) {
			List<WkfNtfPlantillaCampania> listaPlantillaC = new ArrayList<WkfNtfPlantillaCampania>();
			for (WkfNtfCampania temp : obj) {
				
				listaPlantillaC = plantillaCampaniaRepo.findAllByCampania(temp.getIdCampania());
				System.out.println("=============================================");
				System.out.println("Lista de Plantilla por Campania" + listaPlantillaC.toString());
				listaPlantillaC.stream().forEach(x -> {
					List<WkfNtfPlantilla> listaPlantilla = new ArrayList<WkfNtfPlantilla>();
					listaPlantilla = plantillaRepo.finAllById(x.getIdPlantilla());
					System.out.println("=============================================");
					System.out.println("Lista Plantilla: " + listaPlantilla.toString());
				});
			}

		}

	}

}
