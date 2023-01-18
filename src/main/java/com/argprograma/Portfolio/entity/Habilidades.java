
package com.argprograma.Portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Entity

public class Habilidades {


 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 @NotNull
 @Size(min=1, max=100, message="Fuera de rango") 
 private String area;
 @Min(0)
 @Max(100)
 private int porcentaje;  
 
   public Habilidades(String area, int porcentaje) {
        this.area = area;
        this.porcentaje = porcentaje;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
   
   
    public Long getId() {
        return id;
    }

    public String getArea() {
        return area;
    }

    public int getPorcentaje() {
        return porcentaje;
    }
   
   
   public Habilidades(){
       
   }
}
  
