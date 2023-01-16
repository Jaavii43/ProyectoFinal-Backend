
package com.argprograma.Portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Sobremi {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String posicion;
    private String descripcion;
    
    public Sobremi(){
        
    }
    
    public Sobremi(String nombre, String posicion, String descripcion) {
           this.nombre = nombre;
           this.posicion = posicion;
           this.descripcion = descripcion;
        }

}
