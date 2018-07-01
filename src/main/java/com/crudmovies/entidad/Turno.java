package com.crudmovies.entidad;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
public class Turno {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private LocalTime hora;
  private Boolean estado;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LocalTime getHora() {
    return hora;
  }

  public void setHora(LocalTime hora) {
    this.hora = hora;
  }

  public Boolean getEstado() {
    return estado;
  }

  public void setEstado(Boolean estado) {
    this.estado = estado;
  }
}
