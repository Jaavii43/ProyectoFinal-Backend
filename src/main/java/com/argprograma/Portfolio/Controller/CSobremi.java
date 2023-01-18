
package com.argprograma.Portfolio.Controller;

import com.argprograma.Portfolio.Service.ISSobremi;
import com.argprograma.Portfolio.entity.Sobremi;
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
public class CSobremi {
    
    @Autowired
    private ISSobremi sobServ;
    
    @GetMapping("sobremi/ver")
    public List<Sobremi>getSobremi(){
        return sobServ.getSobremi();
    }
    
    @GetMapping("sobremi/traer/ver")
    public Sobremi findSobremi(){
        return sobServ.findSobremi((long)1);
    }
    
    @PostMapping("sobremi/new")
    public String agregarSobremi(@RequestBody Sobremi sobre){
        sobServ.saveSobremi(sobre);
        return "Se Actualizo perfil";
   }

    @DeleteMapping("sobremi/delete/{id}")
    public String deleteSobremi(@PathVariable Long id)
    {
        sobServ.deleteSobremi(id);
        return "El perfil fue borrado";
    }
    @PutMapping ("sobremi/editar/{id}")
        public Sobremi editSobremi(@PathVariable Long id, @RequestParam("nombre") String nuevoNombre, @RequestParam("posicion") String nuevaPosicion, @RequestParam("descripcion") String nuevadescripcion){
   
            Sobremi sobreServ=sobServ.findSobremi(id);
    
            sobreServ.setNombre(nuevoNombre);
            sobreServ.setPosicion(nuevaPosicion);
            sobreServ.setDescripcion(nuevadescripcion);
            sobServ.saveSobremi(sobreServ);
            return sobreServ;
        }
    
}
