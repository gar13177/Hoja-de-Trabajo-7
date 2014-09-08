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
public class NodoHuffmanTest {
    
    public NodoHuffmanTest() {
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
     * Test of getOcurrencia method, of class NodoHuffman.
     */
    @Test
    public void testGetOcurrencia() {
        System.out.println("getOcurrencia");
        NodoHuffman instance = new NodoHuffman("AB",2);
        NodoHuffman v1 =new NodoHuffman("A",1);
        v1.setCodigo("1");
        instance.setHijoDer(v1);
        NodoHuffman v2 = new NodoHuffman("B",1);
        v2.setCodigo("0");
        instance.setHijoIzq(v2);
        
        int expResult = 2;
        int result = instance.getOcurrencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOcurrencia method, of class NodoHuffman.
     */
    @Test
    public void testSetOcurrencia() {
        System.out.println("setOcurrencia");
        int _ocurrencia = 0;
        NodoHuffman instance = new NodoHuffman("AB",2);
        NodoHuffman v1 =new NodoHuffman("A",1);
        v1.setCodigo("1");
        instance.setHijoDer(v1);
        NodoHuffman v2 = new NodoHuffman("B",1);
        v2.setCodigo("0");
        instance.setHijoIzq(v2);
        instance.setOcurrencia(_ocurrencia);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class NodoHuffman.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        NodoHuffman instance = new NodoHuffman("AB",2);
        NodoHuffman v1 =new NodoHuffman("A",1);
        v1.setCodigo("1");
        instance.setHijoDer(v1);
        NodoHuffman v2 = new NodoHuffman("B",1);
        v2.setCodigo("0");
        instance.setHijoIzq(v2);
        String expResult = "AB 2";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigo method, of class NodoHuffman.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        NodoHuffman instance = new NodoHuffman("AB",2);
        NodoHuffman v1 =new NodoHuffman("A",1);
        v1.setCodigo("1");
        instance.setHijoDer(v1);
        NodoHuffman v2 = new NodoHuffman("B",1);
        v2.setCodigo("0");
        instance.setHijoIzq(v2);
        String expResult = "1";
        String result = ((NodoHuffman)instance.getHijoDer()).getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class NodoHuffman.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        String _codigo = "01";
        NodoHuffman instance = new NodoHuffman("AB",2);
        NodoHuffman v1 =new NodoHuffman("A",1);
        v1.setCodigo("1");
        instance.setHijoDer(v1);
        NodoHuffman v2 = new NodoHuffman("B",1);
        v2.setCodigo("0");
        instance.setHijoIzq(v2);
        instance.setCodigo(_codigo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
