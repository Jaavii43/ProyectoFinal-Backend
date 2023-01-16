
package com.argprograma.Portfolio.Service;

import com.argprograma.Portfolio.Repository.RProyectos;
import com.argprograma.Portfolio.entity.Proyectos;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyectos implements ISProyectos {

@Autowired
private RProyectos rProyectos;

    @Override
    public List<Proyectos> getProyecto() {
        List<Proyectos> listaProyectoss = rProyectos.findAll();
        return listaProyectoss;
    }

    @Override
    public void saveProyecto(Proyectos proy) {
        rProyectos.save(proy);
    }

    @Override
    public void deleteProyecto(Long id) {
        rProyectos.deleteById(id);
    }

    @Override
    public Proyectos findProyecto(Long id) {
        Proyectos proy=rProyectos.findById(id).orElse(null);
        return proy;
    }
    

    
}
