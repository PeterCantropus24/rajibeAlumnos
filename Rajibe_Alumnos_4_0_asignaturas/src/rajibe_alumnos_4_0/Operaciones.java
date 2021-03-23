/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rajibe_alumnos_4_0;

import java.util.ArrayList;

/**
 *
 * @author satrux
 */
public interface Operaciones {
    
    public void add(Object item);
    
    public boolean delete(Object item);
    
    public ArrayList<Object> getItems();  
    
    public Object buscar(Object item);
    
}
