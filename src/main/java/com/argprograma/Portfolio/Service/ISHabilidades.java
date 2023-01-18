
package com.argprograma.Portfolio.Service;

import com.argprograma.Portfolio.entity.Habilidades;
import java.util.List;


public interface ISHabilidades {
    
    public List<Habilidades>getSkins();
    public void saveSkins(Habilidades hab);
    public void deleteSkin(Long id);
    public Habilidades findSkin(Long id);
   
           
    
}
