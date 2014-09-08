/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos 2014
 * Hoja de Trabajo No. 7
 * Algoritmo de Huffman
 * 
 * Vidal Villegas Zabala 13023
 * Kevin Estuardo Garcia 13177
 */

package AlgoritmoDeHuffman;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin
 */
public class ArbolBinarioTest {
    
    public ArbolBinarioTest() {
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
     * Test of Preorden method, of class ArbolBinario.
     */
    @Test
    public void testPreorden() {
        System.out.println("Preorden");
        ArbolBinario instance = new ArbolBinario();
        String expResult = "";
        String result = instance.Preorden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Postorden method, of class ArbolBinario.
     */
    @Test
    public void testPostorden() {
        System.out.println("Postorden");
        ArbolBinario instance = new ArbolBinario();
        String expResult = "";
        String result = instance.Postorden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Inorden method, of class ArbolBinario.
     */
    @Test
    public void testInorden() {
        System.out.println("Inorden");
        ArbolBinario instance = new ArbolBinario();
        String expResult = "";
        String result = instance.Inorden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Buscar method, of class ArbolBinario.
     */
    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        String numero = "";
        ArbolBinario instance = new ArbolBinario();
        String expResult = "";
        String result = instance.Buscar(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Contar method, of class ArbolBinario.
     */
    @Test
    public void testContar() {
        System.out.println("Contar");
        ArbolBinario instance = new ArbolBinario();
        int expResult = 0;
        int result = instance.Contar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Altura method, of class ArbolBinario.
     */
    @Test
    public void testAltura() {
        System.out.println("Altura");
        ArbolBinario instance = new ArbolBinario();
        int expResult = 0;
        int result = instance.Altura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRaiz method, of class ArbolBinario.
     */
    @Test
    public void testGetRaiz() {
        System.out.println("getRaiz");
        ArbolBinario instance = new ArbolBinario();
        NodoBinario expResult = null;
        NodoBinario result = instance.getRaiz();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRaiz method, of class ArbolBinario.
     */
    @Test
    public void testSetRaiz() {
        System.out.println("setRaiz");
        NodoBinario _raiz = null;
        ArbolBinario instance = new ArbolBinario();
        instance.setRaiz(_raiz);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
