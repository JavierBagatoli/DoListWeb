package Persistencia;

import Logica.Persona;
import Logica.Tarea;
import java.util.List;

public class ControladoraPersistencia {
    PersonaJpaController personaJPA = new PersonaJpaController();
    TareaJpaController tareaJPA = new TareaJpaController();
    
    public void personaAlta(Persona persona) {
        personaJPA.create(persona);
    }

    public void tareaAlta(Tarea tarea) {
        tareaJPA.create(tarea);
    }

    public List<Tarea> tareaMostrar() {
        return tareaJPA.findTareaEntities();
    }
    
}
