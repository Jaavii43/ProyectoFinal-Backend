
package com.argprograma.Portfolio.Service;

import com.argprograma.Portfolio.Repository.REducacion;
import com.argprograma.Portfolio.entity.Educacion;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion implements ISEducacion {
    @Autowired
    private REducacion rEducacion;

    @Override
    public List<Educacion> getEscuela() {
        List<Educacion> listaEscuelas = rEducacion.findAll();
        return listaEscuelas;
    }

    @Override
    public void saveEscuela(Educacion escu) {
        rEducacion.save(escu);
    }

    @Override
    public void deleteEscuela(Long id) {
        rEducacion.deleteById(id);
    }

    @Override
    public Educacion findEscuela(Long id) {
        Educacion esc=rEducacion.findById(id).orElse(null);
        return esc;
    }



}
