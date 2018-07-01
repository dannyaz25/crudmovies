package com.crudmovies.controlador;

import com.crudmovies.entidad.Turno;
import com.crudmovies.servicios.TurnoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TurnoController {
    @Autowired
    private TurnoServicio turnoServicio;
    @RequestMapping(value="/turnos",method = RequestMethod.GET)
    public String list(Model modelo){
        modelo.addAttribute("turnos",turnoServicio.listAllTurno());
        return "turnos";
    }
    @RequestMapping("turno/{id}")
    public String showturno(@PathVariable Integer id, Model modelo){
         turnoServicio.getTurnoById(id).ifPresent(o -> modelo.addAttribute("turno",o));
        return "turnoshow";
    }
    @RequestMapping("turno/edit/{id}")
    public String edit(@PathVariable Integer id,Model modelo){

         turnoServicio.getTurnoById(id).ifPresent(o -> modelo.addAttribute("turno",o));
        return "turnoform";
    }
    @RequestMapping("turno/new")
    public String newturno(Model modelo){
        modelo.addAttribute("turno",new Turno());
        return "turnoform";
    }
    @RequestMapping(value="turno",method =  RequestMethod.POST)
    public String saveturno(Turno turno){
        turnoServicio.saveTurno(turno);
        return "redirect:/turno/"+turno.getId();

    }
    @RequestMapping("turno/delete/{id}")
    public String delete(@PathVariable Integer id){
        turnoServicio.deleteTurno(id);
        return "redirect:/turnos";
    }
}
