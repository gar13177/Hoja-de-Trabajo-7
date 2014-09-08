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
public class ArbolHuffmanTest {
    
    
    
    public ArbolHuffmanTest() {
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
     * Test of Buscar method, of class ArbolHuffman.
     */
    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        String dato = "A";
        NodoHuffman n = new NodoHuffman("AB",2);
        NodoHuffman v1 =new NodoHuffman("A",1);
        v1.setCodigo("1");
        n.setHijoDer(v1);
        NodoHuffman v2 = new NodoHuffman("B",1);
        v2.setCodigo("0");
        n.setHijoIzq(v2);
        ArbolHuffman instance = new ArbolHuffman(n);
        String expResult = "1";
        String result = instance.Buscar(dato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Decode method, of class ArbolHuffman.
     */
    @Test
    public void testDecode() {
        System.out.println("Decode");
        String dato = "0";
        NodoHuffman n = new NodoHuffman("AB",2);
        NodoHuffman v1 =new NodoHuffman("A",1);
        v1.setCodigo("1");
        n.setHijoDer(v1);
        NodoHuffman v2 = new NodoHuffman("B",1);
        v2.setCodigo("0");
        n.setHijoIzq(v2);
        ArbolHuffman instance = new ArbolHuffman(n);
        String expResult = "B";
        String result = instance.Decode(dato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
