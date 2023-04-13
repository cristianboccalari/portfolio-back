
package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.Idioma;
import java.util.List;


public interface IIdiomaService {
    
   public List<Idioma> getIdioma(); 
   
   public void saveIdioma (Idioma idi); 
   
   public void deleteIdioma(Long id); 
   
   public Idioma findIdioma(Long id); 
}
