
package com.argprograma.Portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Proyectos {


 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String tipo;
 private String sector;
 private String tiempo_ejecucion;

    public Proyectos(String tipo, String sector, String tiempo_ejecucion) {
        this.tipo = tipo;
        this.sector = sector;
        this.tiempo_ejecucion = tiempo_ejecucion;
    }
 

}
  