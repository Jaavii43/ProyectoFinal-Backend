
package com.argprograma.Portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Sobremi {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=1, max=50, message="fuera de rango")
    private String nombre;
    @NotNull
    @Size(min=1, max=50, message="fuera de rango")
    private String posicion;
    @NotNull
    @Size(min=1, max=250, message="fuera de rango")
    private String descripcion;
    @Size(min=1, max=50, message="fuera de rango")
    private String imagen;
    @Lob
    private String email;
    @Size(min=6, max=20, message="fuera de rango")
    private String clave;
    
    public Sobremi(){
        
    }
    
    public Sobremi(String nombre, String posicion, String descripcion, String imagen, String email, String clave) {
           this.nombre = nombre;
           this.posicion = posicion;
           this.descripcion = descripcion;
           this.imagen = imagen;
           this.email = email;
           this.clave = clave;
        }

}
