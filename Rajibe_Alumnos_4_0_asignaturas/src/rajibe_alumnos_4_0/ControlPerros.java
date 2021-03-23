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
public class ControlPerros extends Control {

    private Map< Perro, Persona> owners;

    public ControlPerros() {
        super();
        owners = new HashMap<>();
    }

    public ArrayList<Object> getPerro() {//listar
        return getItems();
    }
    
    /**
     * metodo para insertar perros en la ArrayList
     * @param perro objeto requerido para insertar
     */

    public void insertar(Perro perro) {
        add(perro);
    }

    //falla
//    public void listarPerros() {
//        Control control;
//        for (int i = 0; i < getPerro().size(); i++) {
//            System.out.println("" + getPerro());
//        }
//    }
    
    /**
     * este metodo sirve para borrar un objeto
     * @param item el objeto que queremos eliminar
     * @return true siexiste el item y se elimina
     */
    
    
    @Override
    public boolean delete(Object item) {
        Iterator<Object> iterator = getItems().iterator();

        while (iterator.hasNext()) {
            Perro perro = (Perro) iterator.next();
            if (perro.getIdentificador().compareTo((Integer) item) == 0) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    /**
     * este metodo verifica que exista el perro, la persona y los asigna
     *
     * @param perro obligatorio
     * @param persona obligatorio
     */
    public boolean asignarDueno(Perro perro, Persona persona) {

        if ((perro == null) || (persona == null)) {
            return false;
        }
        if (buscar(perro.getIdentificador()) == null) {
            return false;
        }
        if (owners.containsKey(perro)) {
            return false;
        }

        owners.put(perro, persona);

        return true;
    }

    @Override
    public Object buscar(Object item) {
        Iterator<Object> iterator = getItems().iterator();

        while (iterator.hasNext()) {
            Perro perro = (Perro) iterator.next();
            if (perro.getIdentificador().compareTo((Integer) item) == 0) {
                return perro;
            }
        }
        return null;
    }

    public Object obtenerDueno(Object item) {
        return owners.get(item);
    }

    public Object obtenerDueno(Integer identificador) {
        Iterator<Object> iterator = getItems().iterator();
        while (iterator.hasNext()) {
            Perro perro = (Perro) iterator.next();
            if (perro.getIdentificador().compareTo(identificador) == 0) {
                return owners.get(perro);
            }
        }

        return null;
    }

    public Boolean obtenerPersona(Persona persona) {

        return owners.containsValue(persona);
    }

}
