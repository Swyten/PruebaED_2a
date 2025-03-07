/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.iescomercio.entornos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.lang.IllegalArgumentException;

/**
 *
 * @author Vespertino
 */
public class junit2Test {
    static junit2 j;
    
    public junit2Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        j=new junit2();
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

    @Test
    public void test1() {
       Exception e = assertThrows(java.lang.IllegalArgumentException.class, 
                () -> { j.calculo(-1);});
        assertEquals("El numero no puede ser negativo o 0", e.getMessage());
    }
    @Test
    public void test2() {
           Exception e = assertThrows(java.lang.ArithmeticException.class, 
                () -> { j.calculo(1000000);});
        assertEquals("Overflow", e.getMessage());
    }
    @Test
    public void test3(){
        assertEquals(6, j.calculo(3));
    }
}
    

