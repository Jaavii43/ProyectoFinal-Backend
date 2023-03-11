
package com.argprograma.Portfolio.Service;

import com.argprograma.Portfolio.Repository.RExperienciaLaboral;
import com.argprograma.Portfolio.entity.ExperienciaLaboral;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperienciaLaboral implements ISExperienciaLaboral {
    @Autowired
    private RExperienciaLaboral rExperinciaLaboral;

    @Override
    public List<ExperienciaLaboral>getEmpresa() {
        List<ExperienciaLaboral> listaEmpresas = rExperinciaLaboral.findAll();
        return listaEmpresas;
    }
    @Override
    public void saveEmpresa(ExperienciaLaboral expe){
        rExperinciaLaboral.save(expe);
   }

    @Override
    public void deleteEmpresa(Long id) {
        rExperinciaLaboral.deleteById(id);
    }

    @Override
    public ExperienciaLaboral findEmpresa(Long id) {
        ExperienciaLaboral empre=rExperinciaLaboral.findById(id).orElse(null);
        return empre;
    }
    
    @Override
    public void modificarEmpresa(ExperienciaLaboral expe){
        rExperinciaLaboral.save(expe);
   }

}
