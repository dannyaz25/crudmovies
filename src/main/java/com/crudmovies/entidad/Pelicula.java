package com.crudmovies.entidad;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.io.File;
import java.util.Date;

@Entity
public class Pelicula{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private Date fecha_publicacion;
    //private String url_imagen;
    @Lob @Basic(fetch = FetchType.LAZY)
    @Column(nullable=false,name = "imagen", columnDefinition = "LONGBLOB")
    private byte[] imagen;
    private String nombre_imagen;
    private Boolean estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(Date fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    //public String getUrl_imagen() {
     //   return url_imagen;
   // }

    //public void setUrl_imagen(String url_imagen) {
     //   this.url_imagen = url_imagen;
    //}

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getNombre_imagen() {
        return nombre_imagen;
    }

    public void setNombre_imagen(String nombre_imagen) {
        this.nombre_imagen = nombre_imagen;
    }
}
