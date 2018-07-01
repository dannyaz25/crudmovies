package com.crudmovies.servicios;

import com.crudmovies.entidad.Pelicula;
import com.crudmovies.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PeliculaServicioImpl implements PeliculaServicio {
    @Autowired
    private PeliculaRepository peliculaReposity;

    @Override
    public Iterable<Pelicula> listAllPelicula() {
       return peliculaReposity.findAll();
    }



       @Override
    public Optional<Pelicula> getPeliculaById(Integer id) {
       return  peliculaReposity.findById(id);
    }

    @Override
    public Pelicula savePelicula(Pelicula pelicula) {
      return   peliculaReposity.save(pelicula);
    }

    @Override
    public void deletePelicula(Integer id) {
         peliculaReposity.deleteById(id);
    }
}
