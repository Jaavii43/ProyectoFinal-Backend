package com.argprograma.Portfolio.Controller;

import com.argprograma.Portfolio.Service.ISEducacion;
import com.argprograma.Portfolio.entity.Educacion;
import com.argprograma.Portfolio.entity.Habilidades;
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

@RequestMapping("educacion")
@CrossOrigin(origins = "http://localhost:4200/")
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

    @PutMapping("traer/{id}")
    public Educacion editEducacion(@PathVariable Long id,
            @RequestParam("escuela") String nuevaEscuela,
            @RequestParam("fecha_fin") String nuevaFecha_fin,
            @RequestParam("fecha_inicio") String nuevaFecha_inicio,
            @RequestParam("descripcion") String nuevadescripcion,
            @RequestParam("titulo") String nuevoTitulo) {

        Educacion educa = eduServ.findEscuela(id);

        educa.getEscuela();
        educa.getFecha_fin();
        educa.getFecha_inicio();
        educa.getDescripcion();
        educa.getTitulo();
        eduServ.saveEscuela(educa);
        return educa;
    }

}
