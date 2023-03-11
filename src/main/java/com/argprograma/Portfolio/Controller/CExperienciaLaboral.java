
package com.argprograma.Portfolio.Controller;
import com.argprograma.Portfolio.Service.ISExperienciaLaboral;
import com.argprograma.Portfolio.entity.ExperienciaLaboral;
import java.sql.Date;
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

@RequestMapping("trabajos")
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class CExperienciaLaboral{
    
    @Autowired
    private ISExperienciaLaboral expeServ;

    @GetMapping("ver")
    public List<ExperienciaLaboral>getEmpresa()
    {
        return expeServ.getEmpresa();
    }
    
    @GetMapping("ver/{id}")
    public ExperienciaLaboral getEmpresa(@PathVariable Long id){
        return expeServ.findEmpresa(id);
    }
    
    @GetMapping("find")
    public ExperienciaLaboral findEmpresa()
    {
        return expeServ.findEmpresa((long)1);
    }
    
    @PostMapping("/new")
    public String agregarExperienciaLaboral(@RequestBody ExperienciaLaboral expe){
        expeServ.saveEmpresa(expe);
        return "La experiencia laboral fue agregada";
   }

    @DeleteMapping("/delete/{id}")
    public String deleteEmpresa(@PathVariable Long id)
    {
        expeServ.deleteEmpresa(id);
        return "La exoeriencia laboral fue borrada correctamente";
    }
    @PutMapping ("editar/")
    public String ExperienciaLaboral(@RequestBody ExperienciaLaboral expe)
    {
        expeServ.modificarEmpresa(expe);
        return "Edicion exitosa";
    }

}