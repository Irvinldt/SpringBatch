package com.example.demo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "wkf_ntf_campania")
public class WkfNtfCampania implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_campania")
    private Long idCampania;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fecha_inicio")
    private LocalDateTime fechaInicio;

    @Column(name = "fecha_fin")
    private LocalDateTime fechaFin;

    @Column(name = "id_frecuencia")
    private Long idFrecuencia;

    @Column(name = "remitente")
    private String remitente;

    @Column(name = "destino")
    private String destino;

    @Column(name = "estado")
    private String estado;

    public WkfNtfCampania() {
    }

    public WkfNtfCampania(Long idCampania, String nombre, String descripcion, LocalDateTime fechaInicio, LocalDateTime fechaFin, Long idFrecuencia, String remitente, String destino, String estado) {
        this.idCampania = idCampania;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.idFrecuencia = idFrecuencia;
        this.remitente = remitente;
        this.destino = destino;
        this.estado = estado;
    }

    public Long getIdCampania() {
        return idCampania;
    }

    public void setIdCampania(Long idCampania) {
        this.idCampania = idCampania;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Long getIdFrecuencia() {
        return idFrecuencia;
    }

    public void setIdFrecuencia(Long idFrecuencia) {
        this.idFrecuencia = idFrecuencia;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "WkfNtfCampania{" +
                "idCampania=" + idCampania +
                ", nombre='" + nombre + '\'' +
                ", descripcion=" + descripcion +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin='" + fechaFin + '\'' +
                ", idFrecuencia=" + idFrecuencia +
                ", remitente='" + remitente + '\'' +
                ", destino='" + destino + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
