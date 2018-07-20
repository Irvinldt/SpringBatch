package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.WkfNtfCampania;

@Repository
public interface WkfNtfCampaniaRepository extends JpaRepository<WkfNtfCampania, Long>{
	
	@Query("SELECT c FROM WkfNtfCampania c WHERE c.estado = '1'")
	List<WkfNtfCampania> finAllActive();

}
