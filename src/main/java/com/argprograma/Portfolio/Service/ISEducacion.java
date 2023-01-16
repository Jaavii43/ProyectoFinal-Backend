
package com.argprograma.Portfolio.Service;

import com.argprograma.Portfolio.entity.Educacion;
import java.util.List;

public interface ISEducacion {
    
    public List<Educacion>getEscuala();
    public void saveEscuela(Educacion escu);
    public void deleteEscuela(Long id);
    public Educacion findEscuela(Long id);
    
}
