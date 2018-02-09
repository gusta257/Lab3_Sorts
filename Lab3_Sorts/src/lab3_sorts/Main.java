/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
import lab3_sorts.Sort;
/**
 *
 * @author Gustavo De Leon 17085
 * @author Luis Esturban 17256
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Sort bubble = new Sort();
        
        try {
            String sCadena;
            System.out.println("Bienvenido");
            //Funcion para abrir y leer el documento 
            FileReader fr = new FileReader("datosRandom.txt");
            BufferedReader bf = new BufferedReader(fr);
            //bucle para hacer las funciones dependiendo de las lineas del documento
            while ((sCadena = bf.readLine())!=null) {       
                sCadena =bf.readLine();
                StringTokenizer st = new StringTokenizer(sCadena," "); 
                int dimension = st.countTokens(); 
                int []arrNumeros = new int[dimension]; 
                int i=0;
                
                
                while(st.hasMoreTokens()) { 
                    arrNumeros[i] = Integer.parseInt(st.nextToken());   
                i++; 
                }
                    
            } 
            //bubble.bubbleSort(arrNumeros);
                    //for(int item=0; item<arrNumeros.length;item++ ){
                    //System.out.println(arrNumeros[i]);
                    //}
 
        //Sirve si algun dato del documento no sirva
        }catch(Exception e){
            System.out.println("Documento no encontrado o dañado :( por favor verificar");
            }
        System.out.println("Gracias por esperar");
      }
  
}