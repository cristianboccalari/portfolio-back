
package com.SpringBoot.Portofolio.repository;

import com.SpringBoot.Portofolio.model.Idioma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdiomaRepository extends JpaRepository<Idioma, Long>{
    
}
