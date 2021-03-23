/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rajibe_alumnos_4_0;

/**
 *
 * @author Satrux
 */
public class ControlAlumnos2 {
    
    private ControlAlumnos2() {
    }
    
    public static ControlAlumnos2 getInstance() {
        return ControlAlumnos2Holder.INSTANCE;
    }
    
    
    
    
    
    
    private static class ControlAlumnos2Holder {

        private static final ControlAlumnos2 INSTANCE = new ControlAlumnos2();
    }
}
