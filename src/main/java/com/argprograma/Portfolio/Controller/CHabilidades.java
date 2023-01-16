
package com.argprograma.Portfolio.Controller;

import com.argprograma.Portfolio.Service.ISHabilidades;
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
public class CHabilidades {
    
    @Autowired
    private ISHabilidades habServ;

    @GetMapping("ver/habilidades")
    public List<Habilidades>getHabilidades(){
        return habServ.getSkins();
    }
    
    @PostMapping("new/habilidad")
    public String agregarHabilidades(@RequestBody Habilidades hab){
        habServ.saveSkins(hab);
        return "La habilidad fue creada correctamente";
   }

    @DeleteMapping("delete/habilidad/{id}")
    public String deleteHabilidad(@PathVariable Long id)
    {
        habServ.deleteSkin(id);
        return "La persona fue borrada correctamente";
    }
    @PutMapping ("editar/habilidad/{id}")
        public Habilidades editHabilidades(@PathVariable Long id,
                            @RequestParam ("area") String nuevaArea,
                            @RequestParam ("porcentaje") int nuevoPorcentaje)
                            {
   
            Habilidades habil=habServ.findSkin(id);
      
            habil.setArea(nuevaArea);
            habil.setPorcentaje(nuevoPorcentaje);
            return habil;
        }
    
}
