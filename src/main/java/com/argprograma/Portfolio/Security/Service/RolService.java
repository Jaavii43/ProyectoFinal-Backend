
package com.argprograma.Portfolio.Security.Service;

import com.argprograma.Portfolio.Security.Entity.Rol;
import com.argprograma.Portfolio.Security.Enums.RolNombre;
import com.argprograma.Portfolio.Security.Repository.iRolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getbyRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}