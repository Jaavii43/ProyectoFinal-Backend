package com.argprograma.Portfolio.Controller;

import com.argprograma.Portfolio.Service.ISEducacion;
import com.argprograma.Portfolio.entity.Educacion;
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
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("educacion")
@CrossOrigin(origins = "https://portfoliojaviertoro.web.app/")
@RestController
public class CEducacion {

    @Autowired
    private ISEducacion eduServ;

    @GetMapping("ver")
    public List<Educacion> getEscuela() {
        return eduServ.getEscuela();
    }
    
    @GetMapping("ver/{id}")
    public Educacion getEscuela(@PathVariable Long id) {
        return eduServ.findEscuela(id);
    }


    @GetMapping("find")
    public Educacion findEducacion() {
        return eduServ.findEscuela((long) 1);
    }

    @PostMapping("/new")
    public String agregarEducacion(@RequestBody Educacion edu) {
        eduServ.saveEscuela(edu);
        return "La educacion fue creada correctamente";
    }

    @DeleteMapping("delete/{id}")
    public String deleteEducacion(@PathVariable Long id) {
        eduServ.deleteEscuela(id);
        return "La escuela fue borrada correctamente";
    }

    @PutMapping("editar/")
    public String modificarEscuela(@RequestBody Educacion edu){
        eduServ.modificarEscuela(edu);
        return "Fue modificado con exito";
    }

}
