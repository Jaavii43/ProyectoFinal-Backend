
package com.argprograma.Portfolio.Controller;

import com.argprograma.Portfolio.Service.ISEducacion;
import com.argprograma.Portfolio.entity.Educacion;
import com.argprograma.Portfolio.entity.Habilidades;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CEducacion {
    
    @Autowired
    private ISEducacion eduServ;

    @GetMapping("ver/educacion")
    public List<Educacion>getEducacion(){
        return eduServ.getEscuala();
    }
    
    @PostMapping("new/educacion")
    public String agregarEducacion(@RequestBody Educacion edu){
        eduServ.saveEscuela(edu);
        return "La educacion fue creada correctamente";
   }

    @DeleteMapping("delete/educacion/{id}")
    public String deleteEducacion(@PathVariable Long id)
    {
        eduServ.deleteEscuela(id);
        return "La escuela fue borrada correctamente";
    }
    @PutMapping ("editar/educacion/{id}")
        public Educacion editEducacion(@PathVariable Long id,
                            @RequestParam ("escuela") String nuevaEscuela,
                            @RequestParam ("fecha_inicio") String nuevaFecha_inicio,
                            @RequestParam ("fecha_fin") String nuevaFecha_fin,
                            @RequestParam ("titulo") String nuevoTitulo)
                            {
   
            Educacion educa=eduServ.findEscuela(id);
      
            educa.getEscuela();
            educa.getFecha_inicio();
            educa.getFecha_fin();
            educa.getTitulo();
            eduServ.saveEscuela(educa);
            return educa;
        }
    
}
