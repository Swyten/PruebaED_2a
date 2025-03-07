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

/**
 *
 * @author Vespertino
 */
public class TableroTest {
    
    public TableroTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of PintTab method, of class Tablero.
     */
    @org.junit.jupiter.api.Test
    public void testPintTab() {
        System.out.println("PintTab");
        char cTipo = 'T';
        int iFil = 0;
        int iCols = 0;
        String sNomb = "pepe";
        Tablero instance = new Tablero();
        String expResult = "";
        String result = instance.PintTab(cTipo, iFil, iCols, sNomb);
        assertEquals( sNomb + " tiene 0 posiciones", result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
