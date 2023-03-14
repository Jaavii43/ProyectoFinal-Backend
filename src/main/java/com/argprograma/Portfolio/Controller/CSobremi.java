package com.argprograma.Portfolio.Controller;

import com.argprograma.Portfolio.Service.ISSobremi;
import com.argprograma.Portfolio.entity.Sobremi;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sobremi")
@CrossOrigin(origins = "http://localhost:4200/")
public class CSobremi {

    @Autowired
    private ISSobremi sobServ;

    @GetMapping("ver")
    public List<Sobremi> getSobremi() {
        return sobServ.getSobremi();
    }

    @GetMapping("ver/{id}")
    public Sobremi getSobremi(@PathVariable Long id) {
        return sobServ.findSobremi(id);
    }

    @GetMapping("find")
    public Sobremi findSobremi() {
        return sobServ.findSobremi((long) 1);
    }

    @PostMapping("/new")
    public String agregarSobremi(@RequestBody Sobremi sobre) {
        sobServ.saveSobremi(sobre);
        return "Se Actualizo perfil";
    }

    @DeleteMapping("delete/{id}")
    public String deleteSobremi(@PathVariable Long id) {
        sobServ.deleteSobremi(id);
        return "El perfil fue borrado";
    }

    @PutMapping("editar/")
    public String Sobremi(@RequestBody Sobremi sobre) {
        sobServ.modificarSobremi(sobre);
        return "modificacion exitosa";
    }

    //login
    @PostMapping("autentication/login")
    public Sobremi loginSobremi(@RequestBody Sobremi sobre) {
        return sobServ.loginSobremi(sobre.getEmail(), sobre.getClave());
    }
}
