package com.crudmovies.servicios;

import com.crudmovies.entidad.Pelicula;

import java.util.Optional;


public interface PeliculaServicio {
    Iterable<Pelicula> listAllPelicula();

   Optional<Pelicula> getPeliculaById(Integer id);

    Pelicula savePelicula(Pelicula pelicula);

    void deletePelicula(Integer id);
}
