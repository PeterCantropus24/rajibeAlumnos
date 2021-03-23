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
 * @author Sautrux
 */
public abstract class Control implements Operaciones {

    private ArrayList<Object> items;

    public Control() {
        items = new ArrayList<>();
    }
    
   /**
     * metodo sobreescribe el metodo add de la interfaz Operaciones
     * @param item
     * @return Object
     */

    @Override
    public void add(Object item) {// añadir
        items.add(item);
    }
    
    /**
     * metodo sobreescribe el metodo delete de la interfaz Operaciones
     * @param item
     * @return Object
     */

    @Override
    public abstract boolean delete(Object item);//borrar

    
    /**
     * metodo sobreescribe el metodo getItems de la interfaz Operaciones
     * @param item
     * @return Object
     */
    @Override
    public ArrayList<Object> getItems() {//listar
        return items;        
    }

    
}
