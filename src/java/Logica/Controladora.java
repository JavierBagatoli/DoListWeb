/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.ControladoraPersistencia;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author JavW11trial
 */
public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    public void personaAlta(String nombrePersona, String apellidoPersona, String passwordPersona, Date nacimientoPersona) {
        Persona persona = new Persona();
        persona.setApellido(apellidoPersona);
        persona.setNombre(nombrePersona);
        persona.setPassword(passwordPersona);
        persona.setFechaNacimiento(nacimientoPersona);
        
        controlPersis.personaAlta(persona);
    }

    public void tareaAlta(String nombreTarea, String descripcionTarea, Date fechaCaducidad) {
        Tarea tarea = new Tarea();
        tarea.setNombre(nombreTarea);
        tarea.setDescripcion(descripcionTarea);
        tarea.setFechaCreacion(new Date());
        tarea.setFechaLimite(fechaCaducidad);
        
        controlPersis.tareaAlta(tarea);
    }
    public List<Tarea> tareaMostrar(){
        return controlPersis.tareaMostrar();
    }
    
}
