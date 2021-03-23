/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rajibe_alumnos_4_0;

/**
 *
 * @author sautrux
 */
public class Persona {
    
    private String nombre;
    private String dni;

    
    /**
     * constructor de la clase persona
     * @param nombre
     * @param dni 
     */
    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    /**
     * Devuelve un nombre
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    
    /**
     * Asigna un nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve un DNI
     * @return String 
     */
    public String getDni() {
        return dni;
    }
    
    /**
     * Asigna un dni
     * @param dni 
     */

    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * sobreescribimos el metodo toString para dar el formato que queremos
     * @return StringS
     */
    @Override
    public String toString() {
        return "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
    
    
}
