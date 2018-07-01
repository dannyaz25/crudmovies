package com.crudmovies.servicios;

import com.crudmovies.entidad.Turno;

import java.util.Optional;


public interface TurnoServicio {
    Iterable<Turno> listAllTurno();
   Optional<Turno> getTurnoById(Integer id);

    Turno saveTurno(Turno turno);

    void deleteTurno(Integer id);
}
