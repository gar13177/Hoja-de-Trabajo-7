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
public class ArbolHuffman extends ArbolBinario {
    
    ArbolHuffman(NodoHuffman n){
        _raiz = n;
    }
    
    @Override
    public String Buscar(String dato){
        return Buscar((NodoHuffman)_raiz, dato);
    }
    
    private String Buscar(NodoHuffman n, String dato){
        if (n != null){
            if (n.getDato().equals(dato)) return n.getCodigo();
            String ok1 = Buscar((NodoHuffman)n.getHijoIzq(), dato);
            String ok2 = Buscar((NodoHuffman)n.getHijoDer(), dato);
            return ok1+ok2;
        }
        return "";
    }
    
    
}
