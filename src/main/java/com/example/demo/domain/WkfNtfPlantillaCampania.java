package com.example.demo.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "wkf_ntf_plantilla_campania")
public class WkfNtfPlantillaCampania implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_plantilla_campania")
    private Long idPlantillaCampania;

    @Column(name = "id_plantilla")
    private Long idPlantilla;

    @Column(name = "id_campania")
    private Long idCampania;

    @Column(name = "estado")
    private String estado;

    public WkfNtfPlantillaCampania() {
    }

    public WkfNtfPlantillaCampania(Long idPlantillaCampania, Long idPlantilla, Long idCampania, String estado) {
        this.idPlantillaCampania = idPlantillaCampania;
        this.idPlantilla = idPlantilla;
        this.idCampania = idCampania;
        this.estado = estado;
    }

    public Long getIdPlantillaCampania() {
        return idPlantillaCampania;
    }

    public void setIdPlantillaCampania(Long idPlantillaCampania) {
        this.idPlantillaCampania = idPlantillaCampania;
    }

    public Long getIdPlantilla() {
        return idPlantilla;
    }

    public void setIdPlantilla(Long idPlantilla) {
        this.idPlantilla = idPlantilla;
    }

    public Long getIdCampania() {
        return idCampania;
    }

    public void setIdCampania(Long idCampania) {
        this.idCampania = idCampania;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "WkfNtfPlantillaCampania{" +
                "idPlantillaCampania=" + idPlantillaCampania +
                ", idPlantilla=" + idPlantilla +
                ", idCampania=" + idCampania +
                ", estado='" + estado + '\'' +
                '}';
    }
}
