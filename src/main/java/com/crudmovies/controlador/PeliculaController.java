package com.crudmovies.controlador;


import com.crudmovies.entidad.Pelicula;
import com.crudmovies.servicios.PeliculaServicio;
import com.crudmovies.storage.StorageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


@Controller
public class PeliculaController {


    @Autowired
    public PeliculaController(PeliculaServicio peliculaServicio ) {
        this.peliculaServicio=peliculaServicio;
    }
    //@Autowired
    private final PeliculaServicio  peliculaServicio;
    //@Autowired
   // private StorageService storageService;

    @RequestMapping(value="/peliculas",method = RequestMethod.GET)
    public String list(Model modelo){
    modelo.addAttribute("peliculas",peliculaServicio.listAllPelicula());
    return "peliculas";
    }
    @RequestMapping("pelicula/{id}")
    public String showPelicula(@PathVariable Integer id, Model modelo){
        modelo.addAttribute("editar",false);
        peliculaServicio.getPeliculaById(id).ifPresent(o -> modelo.addAttribute("pelicula",o));
//modelo.addAttribute("pelicula",peliculaServicio.getPeliculaById(id));
    return "peliculashow";
    }
    @RequestMapping("pelicula/edit/{id}")
    public String edit(@PathVariable Integer id,Model modelo){
        modelo.addAttribute("editar",true);
        peliculaServicio.getPeliculaById(id).ifPresent(o -> modelo.addAttribute("pelicula",o));

        //modelo.addAttribute("pelicula",peliculaServicio.getPeliculaById(id));
    return "peliculaform";
    }
    @RequestMapping("pelicula/new")
    public String newPelicula(Model modelo){
        modelo.addAttribute("pelicula",new Pelicula());
        return "peliculaform";
    }
    @RequestMapping("pelicula/delete/{id}")
    public String delete(@PathVariable Integer id){
        peliculaServicio.deletePelicula(id);
        return "redirect:/peliculas";
    }

}
