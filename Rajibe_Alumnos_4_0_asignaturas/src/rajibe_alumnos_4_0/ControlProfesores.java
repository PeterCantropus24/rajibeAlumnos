/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rajibe_alumnos_4_0;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author satrux
 */
public class ControlProfesores extends Control {

    public ControlProfesores() {
        super();
    }

    public ArrayList<Object> getProfesores() {//listar
        return getItems();
    }

    public void insertar(Profesor profesor) {
        add(profesor);
    }

    @Override
    public boolean delete(Object item) {

        Iterator<Object> iterator = getItems().iterator();

        while (iterator.hasNext()) {
            Profesor profesor = (Profesor) iterator.next();
            if (profesor.getDni().contains((String) item)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public Object buscar(Object item) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
