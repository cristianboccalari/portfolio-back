
package com.SpringBoot.Portofolio.controller;


import com.SpringBoot.Portofolio.model.Idioma;
import com.SpringBoot.Portofolio.service.IIdiomaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class IdiomaController {
    @Autowired
    private IIdiomaService interIdioma;
    
    @GetMapping("/idiomas/traer")
    public List<Idioma> getHabilidad(){
        return interIdioma.getIdioma();
    }
    
    @GetMapping("/idiomas/{id}")
    public Idioma findIdioma(@PathVariable Long id){
        return interIdioma.findIdioma(id);
    }
    
    @PostMapping("/idiomas/crear")
    public String createIdioma(@RequestBody Idioma idi){
        interIdioma.saveIdioma(idi);
        return "La idiomas fue creada correctamente";
    }
    
    @DeleteMapping("/idiomas/borrar/{id}")
    public String deleteIdioma (@PathVariable Long id){
        interIdioma.deleteIdioma(id);
        return "La idiomas fue eliminada correctamente";
    }
    
    @PutMapping("/idiomas/editar/{id}")
    public Idioma editIdioma(@PathVariable Long id,
                             @RequestBody Idioma idi){
          idi.setId(id);
          interIdioma.saveIdioma(idi);
          return idi;
    }
}
