
package com.argprograma.Portfolio.Controller;

import com.argprograma.Portfolio.Service.ISHabilidades;
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
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("habilidad")
@CrossOrigin(origins = "https://portfoliojaviertoro.web.app/")
@RestController
public class CHabilidades {
    
    @Autowired
    private ISHabilidades habServ;

    @GetMapping("/ver")
    public List<Habilidades>getHabilidades(){
        return habServ.getSkins();
        }
    
    @GetMapping("ver/{id}")
    public Habilidades getHabilidades(@PathVariable Long id){
        return habServ.findSkin(id);
        }
    
    
    @PostMapping("new")
    public String agregarHabilidades(@RequestBody Habilidades hab)
        {
        habServ.saveSkins(hab);
        return "La habilidad fue creada correctamente";
        }

    @DeleteMapping("delete/{id}")
    public String deleteHabilidad(@PathVariable Long id)
        {
        habServ.deleteSkin(id);
        return "La habilidad fue borrada correctamente";
        }
    @PutMapping ("editar/")
    public String modificarHabilidad(@RequestBody Habilidades hab){
        habServ.modificarHabilidad(hab);
        return "Fue modificado con exito";
    }
}
