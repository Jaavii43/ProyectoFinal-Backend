
package com.argprograma.Portfolio.Controller;

import com.argprograma.Portfolio.Service.ISProyectos;
import com.argprograma.Portfolio.entity.Proyectos;
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
public class CProyectos {
    
    @Autowired
    private ISProyectos proyServ;

    @GetMapping("ver/proyectos")
    public List<Proyectos>getProyecto(){
        return proyServ.getProyecto();
    }
    
    @PostMapping("new/proyectos")
    public String agregarProyecto(@RequestBody Proyectos proy){
        proyServ.saveProyecto(proy);
        return "La persona fue creada correctamente";
   }

    @DeleteMapping("delete/proyectos/{id}")
    public String deleteEmpresa(@PathVariable Long id)
    {
        proyServ.deleteProyecto(id);
        return "El proyecto fue borrado correctamente";
    }
    @PutMapping ("editar/proyectos/{id}")
        public Proyectos editExperienciaLaboral(@PathVariable Long id,
                            @RequestParam ("tipo") String nuevoTipo,
                            @RequestParam ("sector") String nuevoSector,
                            @RequestParam ("tiempo_ejecucion") String nuevaTiempo_ejecucion){
   
            Proyectos proyectoServ=proyServ.findProyecto(id);
    
            proyectoServ.setSector(nuevoSector);
            proyectoServ.setTiempo_ejecucion(nuevaTiempo_ejecucion);
            proyectoServ.setTipo(nuevoTipo);
            return proyectoServ;
        }
    
}
