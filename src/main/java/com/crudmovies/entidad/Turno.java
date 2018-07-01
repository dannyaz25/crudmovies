package com.crudmovies.entidad;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

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
  @Temporal(TemporalType.TIME)
  @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
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
