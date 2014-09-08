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
public class NodoBinarioTest {
    
    public NodoBinarioTest() {
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
     * Test of getDato method, of class NodoBinario.
     */
    @Test
    public void testGetDato() {
        System.out.println("getDato");
        NodoBinario instance = new NodoBinario();
        String expResult = "";
        String result = instance.getDato();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDato method, of class NodoBinario.
     */
    @Test
    public void testSetDato() {
        System.out.println("setDato");
        String _dato = "";
        NodoBinario instance = new NodoBinario();
        instance.setDato(_dato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHijoIzq method, of class NodoBinario.
     */
    @Test
    public void testGetHijoIzq() {
        System.out.println("getHijoIzq");
        NodoBinario instance = new NodoBinario();
        NodoBinario expResult = null;
        NodoBinario result = instance.getHijoIzq();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHijoIzq method, of class NodoBinario.
     */
    @Test
    public void testSetHijoIzq() {
        System.out.println("setHijoIzq");
        NodoBinario _hijoIzq = null;
        NodoBinario instance = new NodoBinario();
        instance.setHijoIzq(_hijoIzq);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHijoDer method, of class NodoBinario.
     */
    @Test
    public void testGetHijoDer() {
        System.out.println("getHijoDer");
        NodoBinario instance = new NodoBinario();
        NodoBinario expResult = null;
        NodoBinario result = instance.getHijoDer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHijoDer method, of class NodoBinario.
     */
    @Test
    public void testSetHijoDer() {
        System.out.println("setHijoDer");
        NodoBinario _hijoDer = null;
        NodoBinario instance = new NodoBinario();
        instance.setHijoDer(_hijoDer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
