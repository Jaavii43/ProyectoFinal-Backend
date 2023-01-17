
package com.argprograma.Portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class Habilidades {


 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 @NotNull
 private String area;
 @Min(0)
 @Max(100)
 private int porcentaje;  
 
   public Habilidades(String area, int porcentaje) {
        this.area = area;
        this.porcentaje = porcentaje;
    }
}
  
