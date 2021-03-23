/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rajibe_alumnos_4_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Satrux
 */
public class ControlAsignaturas extends Control {

    Map< Asignatura, Profesor> subject;

    public ControlAsignaturas() {
        super();
        subject = new HashMap<>();
    }

    public ArrayList<Object> getAsignatura() {//listar
        return getItems();
    }

    public void insertar(Asignatura asignatura) {
        add(asignatura);
    }

    public boolean asignarProfesor(Asignatura asignatura, Profesor profesor) {

        if ((asignatura == null) || (profesor == null)) {
            return false;
        }
        if (buscar(asignatura.getId()) == null) {
            return false;
        }
        if (subject.containsKey(asignatura)) {
            return false;
        }

        subject.put(asignatura, profesor);

        return true;
    }

    public Object obtenerProfesor(Object item) {
        return subject.get(item);
    }

    @Override
    public boolean delete(Object item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object buscar(Object item) { //si no implemento este metodo  no me da el nombre de los profesores
        Iterator<Object> iterator = getItems().iterator();

        while (iterator.hasNext()) {
            Asignatura asignatura = (Asignatura) iterator.next();
            if (asignatura.getId().compareTo((Integer) item) == 0) {
                return asignatura;
            }
        }
        return null;
    }

}
