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
    
    protected NodoBinario _raiz;
    
    /*
    public ArbolBinario(){
        _raiz = null;
    }*/
    
    //metodo publico
    public String Preorden(){
        return Preorden(_raiz);
    }
    
    //metodo privado
    private String Preorden(NodoBinario n){
        if (n != null){
            String s = "";
            s += n.getDato()+" ";
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
            s += n.getDato()+" ";           
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
            s += n.getDato()+" "; 
            s += Inorden(n.getHijoDer()); 
            return s;
        }
        return "";
    }
    
    public String Buscar(String numero){
        if (Buscar(_raiz, numero))
            return "Encontrado";
        return "No encontrado";
    }
    
    private boolean Buscar(NodoBinario n, String numero){
        if (n != null){
            if (n.getDato().equals(numero)) return true;
            boolean ok1 = Buscar(n.getHijoIzq(), numero);
            boolean ok2 = Buscar(n.getHijoDer(), numero);
            if (ok1||ok2) return true;
        }
        return false;
    }
    
    public int Contar(){
        return Contar(_raiz);
    }
    
    private int Contar(NodoBinario n){
        if(n != null){
            int c1 = Contar(n.getHijoIzq());
            int c2 = Contar(n.getHijoDer());
            return c1+c2+1;
        } 
        return 0;
    }
    
    public int Altura(){
        return Altura(_raiz);
    }
    
    private int Altura(NodoBinario n){
        if (n != null){
            int h1 = Altura(n.getHijoIzq());
            int h2 = Altura(n.getHijoDer());
            if (h1>h2) return h1+1;
            return h2+1;
        }
        return 0;
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
