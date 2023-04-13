package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.Estudio;
import java.util.List;

public interface IEstudioService {
    
   public List<Estudio> getEstudio(); 
   
   public void saveEstudio (Estudio estu); 
   
   public void deleteEstudio(Long id); 
   
   public Estudio findEstudio(Long id); 
}
