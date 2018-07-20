package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.WkfNtfPlantilla;

@Repository
public interface WkfNtfPlantillaRepository extends JpaRepository<WkfNtfPlantilla, Long> {
	
	@Query("SELECT wnp FROM WkfNtfPlantilla wnp WHERE wnp.estado = 1 AND wnp.idPlantilla=:idPlantilla")
	public List<WkfNtfPlantilla> finAllById(@Param(value = "idPlantilla") Long idPlantilla);

}
