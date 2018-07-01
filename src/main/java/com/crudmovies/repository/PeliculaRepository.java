package com.crudmovies.repository;

import com.crudmovies.entidad.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PeliculaRepository extends CrudRepository<Pelicula,Integer> {
}
