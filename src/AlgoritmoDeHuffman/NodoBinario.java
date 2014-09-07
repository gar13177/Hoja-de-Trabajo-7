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
public class NodoBinario {
    private String _dato;
    private NodoBinario _hijoIzq;
    private NodoBinario _hijoDer;
    
    public NodoBinario(String dato, NodoBinario hijoIzq, NodoBinario hijoDer){
        _dato = dato;
        _hijoIzq = hijoIzq;
        _hijoDer = hijoDer;
        
    }
    
    public NodoBinario(String dato){
        _dato = dato;
        _hijoIzq = null;
        _hijoDer = null;
        
    }

    /**
     * @return the _dato
     */
    public String getDato() {
        return _dato;
    }

    /**
     * @param _dato the _dato to set
     */
    public void setDato(String _dato) {
        this._dato = _dato;
    }

    /**
     * @return the _hijoIzq
     */
    public NodoBinario getHijoIzq() {
        return _hijoIzq;
    }

    /**
     * @param _hijoIzq the _hijoIzq to set
     */
    public void setHijoIzq(NodoBinario _hijoIzq) {
        this._hijoIzq = _hijoIzq;
    }

    /**
     * @return the _hijoDer
     */
    public NodoBinario getHijoDer() {
        return _hijoDer;
    }

    /**
     * @param _hijoDer the _hijoDer to set
     */
    public void setHijoDer(NodoBinario _hijoDer) {
        this._hijoDer = _hijoDer;
    }
}
