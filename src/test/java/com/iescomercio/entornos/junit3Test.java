/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.iescomercio.entornos;

import static com.iescomercio.entornos.junit2Test.j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Vespertino
 */
public class junit3Test {
    
    public junit3Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sumaTabla method, of class junit3.
     */
    @Test
    public void testTablasEnteros(){
     Exception e = assertThrows(java.lang.IllegalArgumentException.class, 
                () -> { j.calculo(-1);});
        assertEquals("El numero no puede ser negativo o 0", e.getMessage());
    }
    
}
