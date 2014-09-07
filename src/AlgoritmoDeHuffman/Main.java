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
        
        NodoBinario n1 = new NodoBinario("1");
        NodoBinario n2 = new NodoBinario("2");
        NodoBinario n3 = new NodoBinario("3");
        NodoBinario n4 = new NodoBinario("4");
        NodoBinario n5 = new NodoBinario("5");
        NodoBinario n6 = new NodoBinario("6");
        NodoBinario n7 = new NodoBinario("7");
        
        n5.setHijoIzq(n6);
        n5.setHijoDer(n7);
        n2.setHijoIzq(n4);
        n2.setHijoDer(n5);
        n1.setHijoIzq(n2);
        n1.setHijoDer(n3);
        _newArbol.setRaiz(n1);
        
        
        
        System.out.println(_newArbol.Preorden());
        System.out.println(_newArbol.Postorden());
        System.out.println(_newArbol.Inorden());
        
        System.out.println(_newArbol.Contar());
        System.out.println(_newArbol.Altura());
    }
    
}
