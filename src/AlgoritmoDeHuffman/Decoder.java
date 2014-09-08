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
public class Decoder {
    private String[] _codigos;
    private char[] _letras;
    
    public Decoder(){}
    
    
    public String Decode(String c){
        return Decoden(c,0);
    }
    
    private String Decoden(String c, int i){
        String subStr;
        if(c.length() == 0) return "";
        else{
            
            try{
                subStr = c.substring(0, _codigos[i].length()-1);
                if(subStr.equals(_codigos[i])){
                    return getLetras()[i]+Decoden(c.substring(_codigos[i].length(),c.length()-1),0);                   
                }else{
                    return Decoden(c,i+1);
                }
            }catch (Exception e){
                return Decoden(c,i+1);
            }
            
                        
        }
    }

    /**
     * @return the _codigos
     */
    public String[] getCodigos() {
        return _codigos;
    }


    /**
     * @return the _letras
     */
    public char[] getLetras() {
        return _letras;
    }


    /**
     * @param _codigos the _codigos to set
     */
    public void setCodigos(String[] _codigos) {
        this._codigos = _codigos;
    }

    /**
     * @param _letras the _letras to set
     */
    public void setLetras(char[] _letras) {
        this._letras = _letras;
    }
    
    
    
}
