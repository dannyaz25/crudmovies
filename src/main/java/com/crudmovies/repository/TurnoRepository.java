package com.crudmovies.repository;

import com.crudmovies.entidad.Turno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface TurnoRepository extends CrudRepository<Turno,Integer> {
}
