
package com.argprograma.Portfolio.Service;

import com.argprograma.Portfolio.entity.Proyectos;
import java.util.List;


public interface ISProyectos {
    
    public List<Proyectos>getProyecto();
    public void saveProyecto(Proyectos proy);
    public void deleteProyecto(Long id);
    public Proyectos findProyecto(Long id);
    public void modificarProyecto(Proyectos proy);
    
}
