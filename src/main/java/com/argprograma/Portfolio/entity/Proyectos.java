
package com.argprograma.Portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Proyectos {


 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 @NotNull
 private String tipo;
 @NotNull
 private String sector;
 @NotNull
 private String tiempo_ejecucion;
  @NotNull
 private Boolean valor;

    public Proyectos(String tipo, String sector, String tiempo_ejecucion, Boolean valor) {
        this.tipo = tipo;
        this.sector = sector;
        this.tiempo_ejecucion = tiempo_ejecucion;
        this.valor = valor;
    }
    
    public Proyectos(){
        
    }
 

}
  