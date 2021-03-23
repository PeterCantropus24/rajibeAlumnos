/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rajibe_alumnos_4_0;

import java.util.Scanner;

/**
 *
 * @author sautrux
 * version 4.0
 */
public class Rajibe_Alumnos_3_0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ControlProfesores profesores = new ControlProfesores();
        ControlPerros controlPerro = new ControlPerros();
        ControlAlumnos alumnos;
        ControlAsignaturas asignaturas = new ControlAsignaturas();
        Asignatura asignatura;
        Persona persona;
        Alumno alumno;
        Profesor profesor;
        Perro perro;
        Scanner entrada = new Scanner(System.in);;
        int opcion = 0;

        //alumnos
        Alumno alumno1 = new Alumno("juan", "2427");
        ControlAlumnos.getInstance().insertar(alumno1);
        alumno1 = new Alumno("raul", "1111");
        ControlAlumnos.getInstance().insertar(alumno1);
        alumno1 = new Alumno("gonzalo", "2222");
        ControlAlumnos.getInstance().insertar(alumno1);
        alumno1 = new Alumno("david", "3333");
        ControlAlumnos.getInstance().insertar(alumno1);

        //profesores
        profesor = new Profesor("raul", "999");
        profesores.add(profesor);
        profesor = new Profesor("sonia", "1010");
        profesores.add(profesor);

        //asignaturas
        asignatura = new Asignatura(55);
        asignaturas.insertar(asignatura);
        asignaturas.asignarProfesor(asignatura, profesor);
        asignatura = new Asignatura(12);
        asignaturas.insertar(asignatura);
        asignaturas.asignarProfesor(asignatura, profesor);
        System.out.println("la asignatura " + asignatura.getId() + " la imparte: " + asignaturas.obtenerProfesor(asignatura));

        //perros
        perro = new Perro(25, "yuca");
        controlPerro.insertar(perro);
        perro = new Perro(77, "tulkas");
        controlPerro.insertar(perro);
        
        //anadirAlumno
        
        asignatura.anadirAlumno(alumno1, controlPerro);

//        perro = (Perro) perros.buscar(25);
//        perro = (Perro) perros.buscar(77);
//        if (perro == null) {
//            System.out.println("no existe el perro");
//        } else {
//            System.out.println("el perro existe");
//
//            if (perros.asignarDueno(perro, alumno1)) {
//                System.out.println("dueño asignado");
//            }
//        }
        controlPerro.asignarDueno(perro, alumno1);
        System.out.println("perro nombre: " + perro.getNombre() + "  dueño:  " + controlPerro.obtenerDueno(perro));
        System.out.println("perro nombre: " + perro.getNombre() + "  dueño:  " + controlPerro.obtenerDueno(25));

//        if(ControlAlumnos.delete("3333")){
//            System.out.println("eliminado");
//        }
//        while (opcion >= 0 && opcion < 6) {
//
//            System.out.println("Elija método");
//            System.out.println("1.- Insertar");
//            System.out.println("2.- Eliminar");
//            System.out.println("3.- Listar");
//            System.out.println("4.- Insertar nota");
//            System.out.println("5.- Listar notas");
//            System.out.println("6.- Salir");
//
//            opcion = entrada.nextInt();
//            String nombre;
//            String dni;
//
//            switch (opcion) {
//                case 1: // insertar
//                    while (opcion == 1 || opcion == 2) {
//                        System.out.println("1.- Insertar Alumno");
//                        System.out.println("2.- Eliminar Profesor");
//                        System.out.println("3.- Salir");
//                        opcion = entrada.nextInt();
//                        if (opcion == 1) {
//                            System.out.println("Nombre alumno: ");
//                            entrada = new Scanner(System.in);
//                            nombre = entrada.next();
//
//                            System.out.println("DNI alumno: ");
//                            entrada = new Scanner(System.in);
//                            dni = entrada.next();
//
//                            alumno = new Alumno(nombre, dni);
//                            ControlAlumnos.getInstance().insertar(alumno);;
//
//                        } else if (opcion == 2) {
//                            System.out.println("Nombre profesor: ");
//                            entrada = new Scanner(System.in);
//                            nombre = entrada.next();
//
//                            System.out.println("DNI profesor: ");
//                            entrada = new Scanner(System.in);
//                            dni = entrada.next();
//
//                            profesor = new Profesor(nombre, dni);
//                            profesores.insertar(profesor);
//
//                        }
//                    }
//
//                    break;
//
//                case 2://eliminar
//                    System.out.println("DNI alumno a eliminar: ");
//                    entrada = new Scanner(System.in);
//                    dni = entrada.next();
//
//                    ControlAlumnos.getInstance().delete(dni);
//                    break;
//
//                case 3://listar
//                    ControlAlumnos.getInstance().getAlumnos();
//                    break;
//
//                case 4://insertar nota por dni
//                    System.out.println("DNI alumno: ");
//                    entrada = new Scanner(System.in);
//                    dni = entrada.next();
//
//                    ControlAlumnos.getInstance().insertarNota(dni);//llama al metodo de la clase controlAlumno
//
//                    break;
//
//                case 5://listar notas por dni
//                    System.out.println("DNI alumno: ");
//                    entrada = new Scanner(System.in);
//                    dni = entrada.next();
//
//                    ControlAlumnos.getInstance().listarNotas(dni);
//
//                    break;
//
//                case 6://salir
//                    System.out.println("Adios");
//                    break;
//
//            }
//        }
    }// main

    public static void rutina() {

    }

}// class
