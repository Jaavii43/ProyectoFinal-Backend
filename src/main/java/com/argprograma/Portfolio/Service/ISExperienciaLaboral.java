
package com.argprograma.Portfolio.Service;

import com.argprograma.Portfolio.entity.ExperienciaLaboral;
import java.util.List;


public interface ISExperienciaLaboral{

    public List<ExperienciaLaboral>getEmpresa();
    public void saveEmpresa(ExperienciaLaboral expe);
    public void deleteEmpresa(Long id);
    public ExperienciaLaboral findEmpresa(Long id);

}
