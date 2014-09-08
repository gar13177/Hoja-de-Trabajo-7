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
            if (n.getDato().contains(dato)){
                String ok =  n.getCodigo();
                String ok1 = Buscar((NodoHuffman)n.getHijoIzq(), dato);
                String ok2 = Buscar((NodoHuffman)n.getHijoDer(), dato);
                return ok+ok1+ok2;
            }
            return "";
        }
        return "";
    }
    
    public String Decode(String dato){
        return Decode((NodoHuffman)_raiz, dato);
    }
    
    private String Decode(NodoHuffman n, String d){
        if ((""+d.charAt(0)).equals("0")){
            if(n.getHijoIzq()!=null){
                if (d.length()!=1){
                    return Decode((NodoHuffman)n.getHijoIzq(),d.substring(1));
                }else{
                    if ((n.getHijoIzq()).getHijoIzq()==null) return (n.getHijoIzq()).getDato();
                    return "error";
                }
            }else{
                if (d.length()!=1){
                    return n.getDato()+Decode((NodoHuffman)_raiz,d.substring(0));
                }else{
                    return "error";//n.getDato();
                }
            }
        }else if((""+d.charAt(0)).equals("1")){
            if(n.getHijoDer()!=null){
                if (d.length()!=1){
                    return Decode((NodoHuffman)n.getHijoDer(),d.substring(1));
                }else{
                    if ((n.getHijoDer()).getHijoDer()==null) return (n.getHijoDer()).getDato();
                    return "error";
                }
            }else{
                if (d.length()!=1){
                    return n.getDato()+Decode((NodoHuffman)_raiz,d.substring(0));
                }else{
                    return "error";//n.getDato();
                }
            }
        }
        return "error";
    }
    
    
}
