/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rajibe_alumnos_3_0;

import rajibe_alumnos_4_0.Notas;
import rajibe_alumnos_4_0.Alumno;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Satrux
 */
public class AlumnoTest {
    
    public AlumnoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNota method, of class Alumno.
     */
    @Test
    public void testGetNota() {
        System.out.println("getNota");
        Alumno instance = null;
        ArrayList<Notas> expResult = null;
        ArrayList<Notas> result = instance.getNota();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNota method, of class Alumno.
     */
    @Test
    public void testSetNota() {
        System.out.println("setNota");
        ArrayList<Notas> nota = null;
        Alumno instance = null;
        instance.setNota(nota);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertarNota method, of class Alumno.
     */
    @Test
    public void testInsertarNota() {
        System.out.println("insertarNota");
        String tipoNota = "";
        Double nota = null;
        Alumno instance = null;
        instance.insertarNota(tipoNota, nota);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Alumno.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Alumno instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
