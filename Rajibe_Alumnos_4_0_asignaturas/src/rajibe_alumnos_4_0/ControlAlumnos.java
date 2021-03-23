
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rajibe_alumnos_4_0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author satrux
 */
public class ControlAlumnos extends Control {

    
    /**
     * constructor de la clase ControAlumnos
     */
    private ControlAlumnos() {
        super();
    }

    public static ControlAlumnos getInstance() {
        return ControlAlumnosHolder.INSTANCE;
    }

    private static class ControlAlumnosHolder {

        private static final ControlAlumnos INSTANCE = new ControlAlumnos();
    }

    /**
     * 
     * @return Object
     */
    public ArrayList<Object> getAlumnos() {
        return getItems();
    }
    
    /**
     * recibe un alumno y lo añade a la arrayList
     * @param alumno 
     */
    public void insertar(Alumno alumno) {
        add(alumno);
    }

    
    /**
     * 
     * @param item
     * @return boolean
     */
    @Override
    public boolean delete(Object item) {
        Iterator<Object> iterator = getItems().iterator();

        while (iterator.hasNext()) {
            Alumno alumno = (Alumno) iterator.next();
            if (alumno.getDni().contains((String) item)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    
    /**
     * 
     * @param item
     * @return Object
     */
    @Override
    public Object buscar(Object item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @param dni 
     */
    public void insertarNota(String dni) {

        for (Object item : getItems()) {// me ha costado verlo xq no termino de entender que se pueda llamar a un metodo sin un objeto de por medio
            Alumno alumno = (Alumno) item;
            if (alumno.getDni().contains(dni)) {
                System.out.println("Tipo de nota: ");
                Scanner entrada = new Scanner(System.in);
                String tipoNota = entrada.next();

                System.out.println("nota: ");
                entrada = new Scanner(System.in);
                Double nota = entrada.nextDouble();
                //pasamos valores al alumno indicado
                alumno.insertarNota(Notas.NOTA_CLASE, nota);
            }
        }
    }// fin metodo insertarNota

    /**
     * 
     * @param dni 
     */
    public void listarNotas(String dni) {

        for (Object item : getItems()) {
            Alumno alumno = (Alumno) item;
            if (alumno.getDni().contains(dni)) {
                ArrayList<Notas> notas = alumno.getNota();

                for (Notas nota : notas) {
                    System.out.println("nota: " + nota.getNota());
                }
            }
        }//for
    }

}
