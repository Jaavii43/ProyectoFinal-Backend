
package com.argprograma.Portfolio.Controller;

import com.argprograma.Portfolio.Service.ISProyectos;
import com.argprograma.Portfolio.entity.Proyectos;
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


@RequestMapping("proyectos")
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class CProyectos {
    
    @Autowired
    private ISProyectos proyServ;

    @GetMapping("ver")
    public List<Proyectos>getProyecto(){
        return proyServ.getProyecto();
    }
    
    @GetMapping("ver/{id}")
    public Proyectos getProyecto(@PathVariable Long id){
        return proyServ.findProyecto(id);
    }
    
    @GetMapping("find")
    public Proyectos findProyecto(){
        return proyServ.findProyecto((long)1);
    }
    
    @PostMapping("/new")
    public String agregarProyecto(@RequestBody Proyectos proy){
        proyServ.saveProyecto(proy);
        return "El proyecto fue creado correctamente";
   }

    @DeleteMapping("delete/{id}")
    public String deleteEmpresa(@PathVariable Long id)
    {
        proyServ.deleteProyecto(id);
        return "El proyecto fue borrado correctamente";
    }
    @PutMapping ("editar/")
    public String Proyectos(@RequestBody Proyectos proy){
        proyServ.modificarProyecto(proy);
        return "Edicion exitosa";
    }
}
