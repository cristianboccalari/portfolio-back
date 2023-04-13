
package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.Idioma;
import com.SpringBoot.Portofolio.repository.IdiomaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdiomaService implements IIdiomaService{
    @Autowired
    private IdiomaRepository idiRepository;

    @Override
    public List<Idioma> getIdioma() {
        List<Idioma> listaIdioma = idiRepository.findAll();
        return listaIdioma;
    }

    @Override
    public void saveIdioma(Idioma idi) {
        idiRepository.save(idi);
    }

    @Override
    public void deleteIdioma(Long id) {
        idiRepository.deleteById(id);
    }

    @Override
    public Idioma findIdioma(Long id) {
        Idioma idi = idiRepository.findById(id).orElse(null);
        return idi;
    }
}
