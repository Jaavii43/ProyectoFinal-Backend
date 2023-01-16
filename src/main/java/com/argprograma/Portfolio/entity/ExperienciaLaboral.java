package com.argprograma.Portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ExperienciaLaboral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String empresa;
    @Temporal(jakarta.persistence.TemporalType.DATE)
    private Date fecha_inicio;
    @Temporal(jakarta.persistence.TemporalType.DATE)
    private Date fecha_fin;
    @Lob
    private String trabajo;

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(String empresa, Date fecha_inicio, Date fecha_fin, String trabajo) {
        this.empresa = empresa;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.trabajo = trabajo;
    }
}
