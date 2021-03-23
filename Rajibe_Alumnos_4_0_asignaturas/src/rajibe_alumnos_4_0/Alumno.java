/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rajibe_alumnos_4_0;

import java.util.ArrayList;

/**
 *
 * @author sautrux
 */
public class Alumno extends Persona {

    private ArrayList<Notas> nota;

    
    /**
     * constructor de la clase Alumno
     * @param nombre
     * @param dni 
     */
    public Alumno(String nombre, String dni) {
        super(nombre, dni);
        nota = new ArrayList<>();
    }

    /**
     * 
     * @return Object 
     */
    public ArrayList<Notas> getNota() {
        return nota;
    }
    
    /**
     * 
     * @param nota 
     */

    public void setNota(ArrayList<Notas> nota) {
        this.nota = nota;
    }

    
    /**
     * 
     * @param tipoNota
     * @param nota 
     */
    public void insertarNota(String tipoNota, Double nota) {
        this.nota.add(new Notas(tipoNota, nota));
    }
    
    /**
     * 
     * @return String
     */

    @Override
    public String toString() {
        return "Alumno{" + super.toString();
    }

}
