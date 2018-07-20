package com.example.demo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;

@Entity
@Table(name = "wkf_ntf_plantilla")
public class WkfNtfPlantilla implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_plantilla")
    private Long idPlantilla;

    @Column(name = "id_canal_notificacion")
    private Long idCanalNotificacion;

    @Column(name = "subject")
    private String subject;

    @Column(name = "detalle")
    private String detalle;

    @Column(name = "adjunto")
    private byte[] adjunto;

    @Column(name = "estado")
    private String estado;

    public WkfNtfPlantilla() {
    }

    public WkfNtfPlantilla(Long idPlantilla, Long idCanalNotificacion, String subject, String detalle, byte[] adjunto, String estado) {
        this.idPlantilla = idPlantilla;
        this.idCanalNotificacion = idCanalNotificacion;
        this.subject = subject;
        this.detalle = detalle;
        this.adjunto = adjunto;
        this.estado = estado;
    }

    public Long getIdPlantilla() {
        return idPlantilla;
    }

    public void setIdPlantilla(Long idPlantilla) {
        this.idPlantilla = idPlantilla;
    }

    public Long getIdCanalNotificacion() {
        return idCanalNotificacion;
    }

    public void setIdCanalNotificacion(Long idCanalNotificacion) {
        this.idCanalNotificacion = idCanalNotificacion;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public byte[] getAdjunto() {
        return adjunto;
    }

    public void setAdjunto(byte[] adjunto) {
        this.adjunto = adjunto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "WkfNtfPlantilla{" +
                "idPlantilla=" + idPlantilla +
                ", idCanalNotificacion=" + idCanalNotificacion +
                ", subject='" + subject + '\'' +
                ", detalle='" + detalle + '\'' +
                ", adjunto=" + Arrays.toString(adjunto) +
                ", estado='" + estado + '\'' +
                '}';
    }
}
