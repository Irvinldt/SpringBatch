package com.example.demo.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

public class WkfNtfCampaniaModelMapper implements RowMapper<WkfNtfCampania> {

	@Override
	public WkfNtfCampania mapRow(ResultSet rs, int rowNum) throws SQLException {
		WkfNtfCampania campania = new WkfNtfCampania();
		campania.setIdCampania(rs.getLong("id_campania"));
		campania.setNombre(rs.getString("nombre"));
		campania.setDescripcion(rs.getString("descripcion"));
		campania.setFechaInicio(convertDate(rs.getTimestamp("fecha_inicio")));
		campania.setFechaFin(convertDate(rs.getTimestamp("fecha_fin")));
		campania.setIdFrecuencia(rs.getLong("id_frecuencia"));
		campania.setRemitente(rs.getString("remitente"));
		campania.setDestino(rs.getString("descripcion"));
		campania.setEstado(rs.getString("descripcion"));
		return campania;
	}
	
	public LocalDateTime convertDate(Date dateToConvert) {
	    return new java.sql.Timestamp(
	      dateToConvert.getTime()).toLocalDateTime();
	}

}
