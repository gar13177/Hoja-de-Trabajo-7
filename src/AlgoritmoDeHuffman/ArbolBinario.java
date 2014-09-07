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
public class ArbolBinario {
    
    private NodoBinario _raiz;
    public ArbolBinario(){
        _raiz = null;
    }
    
    //metodo publico
    public String Preorden(){
        return Preorden(_raiz);
    }
    
    //metodo privado
    private String Preorden(NodoBinario n){
        if (n != null){
            String s = "";
            s += " "+n.getDato();
            s += Preorden(n.getHijoIzq());
            s += Preorden(n.getHijoDer());
            return s;
        }
        return "";
    }
    
    //metodo publico
    public String Postorden(){
        return Postorden(_raiz);
    }
    
    //metodo privado
    private String Postorden(NodoBinario n){
        if (n != null){
            String s = "";
            s += Postorden(n.getHijoIzq());
            s += Postorden(n.getHijoDer());
            s += " "+n.getDato();           
            return s;
        }
        return "";
    }
    
    //metodo publico
    public String Inorden(){
        return Inorden(_raiz);
    }
    
    //metodo privado
    private String Inorden(NodoBinario n){
        if (n != null){
            String s = "";
            s += Inorden(n.getHijoIzq());
            s += " "+n.getDato(); 
            s += Inorden(n.getHijoDer()); 
            return s;
        }
        return "";
    }


    /**
     * @return the _raiz
     */
    public NodoBinario getRaiz() {
        return _raiz;
    }

    /**
     * @param _raiz the _raiz to set
     */
    public void setRaiz(NodoBinario _raiz) {
        this._raiz = _raiz;
    }
    
    
}
