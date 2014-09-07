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

import java.util.*;

/**
 *
 * @author Kevin
 */
public class OrdenarPorOcurrencia implements Comparator {
    @Override
    public int compare(Object n1, Object n2){
        if (((NodoHuffman)n1).getOcurrencia()-((NodoHuffman)n2).getOcurrencia()!=0){
            return ((NodoHuffman)n1).getOcurrencia()-((NodoHuffman)n2).getOcurrencia();
        }
        return -1;
    }
}
