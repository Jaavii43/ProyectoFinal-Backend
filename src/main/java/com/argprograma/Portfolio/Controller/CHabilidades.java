
package com.argprograma.Portfolio.Controller;

import com.argprograma.Portfolio.Service.ISHabilidades;
import com.argprograma.Portfolio.entity.Habilidades;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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


@RequestMapping("habilidad")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CHabilidades {
    
    @Autowired
    private ISHabilidades habServ;

    @GetMapping("/ver")
    public List<Habilidades>getHabilidades()
        {
        return habServ.getSkins();
        }
    @GetMapping("traer")
    public Habilidades findhabilidades()
        {
        return habServ.findSkin((long)1);
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
    @PutMapping ("editar/{id}")
        public Habilidades editHabilidades(@PathVariable Long id,
                            @RequestParam ("area") String nuevaArea,
                            @RequestParam ("porcentaje") int nuevoPorcentaje)
        {
   
            Habilidades habil=habServ.findSkin(id);
      
            habil.setArea(nuevaArea);
            habil.setPorcentaje(nuevoPorcentaje);
            habServ.saveSkins(habil);
            return habil;
        }
}
