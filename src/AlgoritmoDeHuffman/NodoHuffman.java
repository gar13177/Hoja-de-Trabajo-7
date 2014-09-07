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
public class NodoHuffman extends NodoBinario{
    
    private int _ocurrencia;    
    
    NodoHuffman(String dato,int ocurrencia){
        _dato = dato;
        _ocurrencia = ocurrencia;
        _hijoIzq = null;
        _hijoDer = null;
    }

    /**
     * @return the _ocurrencia
     */
    public int getOcurrencia() {
        return _ocurrencia;
    }

    /**
     * @param _ocurrencia the _ocurrencia to set
     */
    public void setOcurrencia(int _ocurrencia) {
        this._ocurrencia = _ocurrencia;
    }
    
    
    
    
}
