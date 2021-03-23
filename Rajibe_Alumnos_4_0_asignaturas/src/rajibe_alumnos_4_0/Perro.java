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
public class Perro {

    private Integer identificador;
    private String nombre;

    public Perro(Integer identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
