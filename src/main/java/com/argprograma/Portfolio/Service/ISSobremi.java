
package com.argprograma.Portfolio.Service;

import com.argprograma.Portfolio.entity.Sobremi;
import java.util.List;


public interface ISSobremi {
    public Sobremi loginSobremi(String nombre, String clave);
    public List<Sobremi>getSobremi();
    public void saveSobremi(Sobremi sobre);
    public void deleteSobremi(Long id);
    public Sobremi findSobremi(Long id);
    public void modificarSobremi(Sobremi sobre);
}
