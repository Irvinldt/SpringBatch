package com.example.demo.batch.config;

import org.springframework.batch.item.ItemProcessor;

import com.example.demo.domain.WkfNtfCampania;

public class ItemProcesor implements ItemProcessor<WkfNtfCampania, WkfNtfCampania>{

	@Override
	public WkfNtfCampania process(WkfNtfCampania campania) throws Exception {
		return campania;
	}

}
