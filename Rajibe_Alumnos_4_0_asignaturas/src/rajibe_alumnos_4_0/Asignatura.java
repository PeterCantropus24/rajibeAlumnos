/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rajibe_alumnos_4_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Satrux
 */
public class Asignatura {

    private Integer id;
    ArrayList<Alumno> student;
    ArrayList<Alumno> studentBlind;

    public Asignatura(Integer id) {
        this.id = id;
        student = new ArrayList<>();
        studentBlind = new ArrayList<>();

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void anadirAlumno(Alumno alumno, ControlPerros controlPerro) {

        if (controlPerro.obtenerPersona(alumno)) {
            studentBlind.add(alumno);
        } else {
            student.add(alumno);
        }
    }

}
