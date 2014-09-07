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

/**
 *
 * @author Kevin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArbolBinario _newArbol = new ArbolBinario();

        System.out.println(_newArbol.Preorden());
        System.out.println(_newArbol.Postorden());
        System.out.println(_newArbol.Inorden());
        
        System.out.println(_newArbol.Contar());
        System.out.println(_newArbol.Altura());
    }
    
}
