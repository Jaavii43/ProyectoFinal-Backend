
package com.argprograma.Portfolio.Controller;
import com.argprograma.Portfolio.Service.ISExperienciaLaboral;
import com.argprograma.Portfolio.entity.ExperienciaLaboral;
import java.sql.Date;
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
public class CExperienciaLaboral{
    
    @Autowired
    private ISExperienciaLaboral expeServ;

    @GetMapping("ver/experiencialaboral")
    public List<ExperienciaLaboral>getEmpresa(){
        return expeServ.getEmpresa();
    }
    
    @PostMapping("new/experiencialaboral")
    public String agregarExperienciaLaboral(@RequestBody ExperienciaLaboral expe){
        expeServ.saveEmpresa(expe);
        return "La persona fue creada correctamente";
   }

    @DeleteMapping("delete/{id}")
    public String deleteEmpresa(@PathVariable Long id)
    {
        expeServ.deleteEmpresa(id);
        return "La persona fue borrada correctamente";
    }
    @PutMapping ("editar/{id}")
        public ExperienciaLaboral editExperienciaLaboral(@PathVariable Long id,
                            @RequestParam ("empresa") String nuevaEmpresa,
                            @RequestParam ("fecha_inicio")Date nuevaFecha_inicio,
                            @RequestParam ("fecha_fin") Date nuevaFecha_fin,
                            @RequestParam ("trabajo") String nuevoTrabajo){
   
      ExperienciaLaboral ExperiServ=expeServ.findEmpresa(id);
    
      ExperiServ.setEmpresa(nuevaEmpresa);
      ExperiServ.setFecha_inicio(nuevaFecha_inicio);
      ExperiServ.setFecha_fin(nuevaFecha_fin);
      ExperiServ.setTrabajo(nuevoTrabajo);
      expeServ.saveEmpresa(ExperiServ);
     //retorna la nueva persona
      return ExperiServ;
        }

}