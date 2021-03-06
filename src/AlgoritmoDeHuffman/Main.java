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

import java.util.Scanner;
import java.util.*;

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
        
        Scanner in  = new Scanner(System.in);
        TreeSet _CaracIng = new TreeSet(new OrdenarPorOcurrencia() );
        

        
        System.out.println("Ingrese la cadena a codificar");
        String mensaje = in.nextLine().toUpperCase();
        
        while (mensaje.length() != 0){
            _CaracIng.add(new NodoHuffman(""+mensaje.charAt(mensaje.length()-1),mensaje.length() - mensaje.replace(""+mensaje.charAt(mensaje.length()-1), "").length()));
            mensaje = mensaje.replace(""+mensaje.charAt(mensaje.length()-1), "");
        }
        System.out.println("Jerarquizacion iniciada: "+_CaracIng);  
        
        
        while (_CaracIng.size() != 1){
             
            NodoHuffman tmp1 = (NodoHuffman)_CaracIng.first();
            _CaracIng.pollFirst();
            NodoHuffman tmp2 = (NodoHuffman)_CaracIng.first();
            _CaracIng.pollFirst();
            
            tmp1.setCodigo("0"+tmp1.getCodigo());
            tmp2.setCodigo("1"+tmp2.getCodigo());
            
            
            NodoHuffman tmp3 = new NodoHuffman(tmp1.getDato()+tmp2.getDato(),tmp1.getOcurrencia()+tmp2.getOcurrencia());
            tmp3.setHijoIzq(tmp1);
            tmp3.setHijoDer(tmp2);
            
            _CaracIng.add(tmp3);
             
          
        }
        System.out.println("Jerarquizacion terminada: "+_CaracIng);
        
        ArbolHuffman _newArbol = new ArbolHuffman((NodoHuffman)_CaracIng.first());
        String raiz = ((NodoHuffman)_newArbol.getRaiz()).getDato();
        String[] codigos = new String[raiz.length()];
        for (int i=0; i<raiz.length();i++){
            codigos[i] = _newArbol.Buscar(""+raiz.charAt(i));
            System.out.println(raiz.charAt(i)+" "+codigos[i]);
        }
        
        System.out.println("Ingrese cadena a decodificar");
        String cadena = in.nextLine();
        String cadena1 = _newArbol.Decode(cadena);
        if (cadena1.contains("error")){
            System.out.println("Cadena erronea");
        }else System.out.println(cadena1);
        
        
        
        
        
        

    }
    
}
