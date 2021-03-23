/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rajibe_alumnos_4_0;

import java.util.Date;

/**
 *
 * @author satrux
 */
public class Notas {
    
    private String tipoNota;
    private double nota;
    private Date fecha;
    public static final String NOTA_CLASE = "Nota de clase";
    public static final String NOTA_EXAMEN = "Note de examen";

    public Notas(String tipoNota, double nota) {
        this.tipoNota = tipoNota;
        this.nota = nota;
        this.fecha = new Date();
    }

    public String getTipoNota() {
        return tipoNota;
    }

    public void setTipoNota(String tipoNota) {
        this.tipoNota = tipoNota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Notas{" + "tipoNota=" + tipoNota + ", nota=" + nota + ", fecha=" + fecha + '}';
    }
    
    
    
}
