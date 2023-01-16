
package com.argprograma.Portfolio.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoExperienciaLaboral {
    private String empresa;
    private String fecha_inicio;
    private String fecha_fin;
    private String trabajo;
    
    public DtoExperienciaLaboral(String empresa, String fecha_inicio, String fecha_fin, String trabajo ) {
        
        this.empresa = empresa;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.trabajo = trabajo;
    }
    public DtoExperienciaLaboral(){
        
    }
 
}
