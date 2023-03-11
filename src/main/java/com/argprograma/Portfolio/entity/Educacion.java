
package com.argprograma.Portfolio.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.validation.constraints.NotNull;
import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String escuela;
    @NotNull
    private String descripcion;
    // @Temporal(jakarta.persistence.TemporalType.DATE)
    private String fecha_inicio;
    // @Temporal(jakarta.persistence.TemporalType.DATE)
    private String fecha_fin;
    @NotNull
    private String titulo;
        
        public Educacion(){
            
        }
        
        public Educacion(String escuela, String fecha_inicio, String fecha_fin, String titulo, String descripcion) {
           this.escuela = escuela;
           this.fecha_inicio = fecha_inicio;
           this.fecha_fin = fecha_fin;
           this.titulo = titulo;
           this.descripcion = descripcion;
        }


 
 
}
