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
public class junit1Test {
    
    public junit1Test() {
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

    @Test
    public void test1() {
        assertEquals("2025/02", new junit1().devuelveFecha(1));
    }
    @Test
    public void test2() {
        assertEquals("02/2025", new junit1().devuelveFecha(2));
    }
    @Test
    public void test3() {
        assertEquals("02/25", new junit1().devuelveFecha(3));
    }
    @Test
    public void test4() {
        assertEquals("ERROR", new junit1().devuelveFecha(30));
    }
    
}
