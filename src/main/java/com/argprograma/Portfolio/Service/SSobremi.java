package com.argprograma.Portfolio.Service;

import com.argprograma.Portfolio.Repository.RSobremi;
import com.argprograma.Portfolio.entity.Sobremi;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SSobremi implements ISSobremi {

    @Autowired
    private RSobremi rSobremi;

    @Override
    public Sobremi loginSobremi(String email, String clave) {
        List<Sobremi> lisSobremi = rSobremi.findByEmailAndClave(email, clave);
        if (!lisSobremi.isEmpty()) {
            return lisSobremi.get(0);
        }
        return null;
    }

    @Override
    public List<Sobremi> getSobremi() {
        List<Sobremi> listaSobremi = rSobremi.findAll();
        return listaSobremi;
    }

    @Override
    public void saveSobremi(Sobremi sobr) {
        rSobremi.save(sobr);
    }

    @Override
    public void deleteSobremi(Long id) {
        rSobremi.deleteById(id);
    }

    @Override
    public Sobremi findSobremi(Long id) {
        Sobremi sob = rSobremi.findById(id).orElse(null);
        return sob;
    }

    @Override
    public void modificarSobremi(Sobremi sobr) {
        rSobremi.save(sobr);
    }

}
