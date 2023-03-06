package com.argprograma.Portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.validation.constraints.NotNull;
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
    @NotNull
    private String empresa;
    // @Temporal(jakarta.persistence.TemporalType.DATE) No lo pude hacer anda con date. Si sobra tiempo pruebo
    private String fecha_inicio;
    // @Temporal(jakarta.persistence.TemporalType.DATE) No lo pude hacer anda con date. Si sobra tiempo pruebo
    private String fecha_fin;
    @Lob
    @NotNull
    private String trabajo;

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(String empresa, String fecha_inicio, String fecha_fin, String trabajo) {
        this.empresa = empresa;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.trabajo = trabajo;
    }
}
