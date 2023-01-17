
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
    @Temporal(jakarta.persistence.TemporalType.DATE)
    private Date fecha_inicio;
    @Temporal(jakarta.persistence.TemporalType.DATE)
    private Date fecha_fin;
    @NotNull
    private String titulo;
        
        public Educacion(){
            
        }
        
        public Educacion(String escuela, Date fecha_inicio, Date fecha_fin, String titulo) {
           this.escuela = escuela;
           this.fecha_inicio = fecha_inicio;
           this.fecha_fin = fecha_fin;
           this.titulo = titulo;
        }


 
 
}
