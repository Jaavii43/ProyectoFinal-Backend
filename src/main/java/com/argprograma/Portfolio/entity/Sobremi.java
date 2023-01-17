
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
public class Sobremi {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nombre;
    @NotNull
    private String posicion;
    @NotNull
    private String descripcion;
    @NotNull
    private String imagen;
    
    
    public Sobremi(){
        
    }
    
    public Sobremi(String nombre, String posicion, String descripcion, String imagen) {
           this.nombre = nombre;
           this.posicion = posicion;
           this.descripcion = descripcion;
           this.imagen = imagen;
        }

}
