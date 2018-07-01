package com.crudmovies.servicios;

import com.crudmovies.entidad.Turno;
import com.crudmovies.repository.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TurnoServicioImpl implements TurnoServicio {
    @Autowired
    TurnoRepository turnoRepository;

    @Override
    public Iterable<Turno> listAllTurno() {
      return   turnoRepository.findAll();
    }



     @Override
    public Optional<Turno> getTurnoById(Integer id) {
        return turnoRepository.findById(id);
    }

    @Override
    public Turno saveTurno(Turno turno) {
       return turnoRepository.save(turno);
    }

    @Override
    public void deleteTurno(Integer id) {
            turnoRepository.deleteById(id);
    }
}
