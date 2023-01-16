
package com.argprograma.Portfolio.Service;

import com.argprograma.Portfolio.Repository.RHabilidades;
import com.argprograma.Portfolio.entity.Habilidades;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHabilidades implements ISHabilidades {
    
    @Autowired
    private RHabilidades rHabilidades;

    @Override
    public List<Habilidades> getSkins() {
        List<Habilidades> listaEscuelas = rHabilidades.findAll();
        return listaEscuelas;
    }

    @Override
    public void saveSkins(Habilidades hab) {
        rHabilidades.save(hab);
    }

    @Override
    public void deleteSkin(Long id) {
        rHabilidades.deleteById(id);
    }

    @Override
    public Habilidades findSkin(Long id) {
        Habilidades hab=rHabilidades.findById(id).orElse(null);
        return hab;
    }
    
}
