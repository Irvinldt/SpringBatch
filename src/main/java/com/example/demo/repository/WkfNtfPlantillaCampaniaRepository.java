package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.WkfNtfPlantillaCampania;

@Repository
public interface WkfNtfPlantillaCampaniaRepository extends JpaRepository<WkfNtfPlantillaCampania, Long> {

	@Query("SELECT wnpc FROM WkfNtfPlantillaCampania wnpc WHERE wnpc.estado = 1 AND wnpc.idCampania = :idCampania")
	public List<WkfNtfPlantillaCampania> findAllByCampania(@Param(value = "idCampania") Long idCampania);

}
