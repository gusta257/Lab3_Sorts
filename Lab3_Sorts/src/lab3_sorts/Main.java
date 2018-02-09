/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
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
        System.out.println("Bienvenido");
        try {
            String sCadena;
            //Funcion para abrir y leer el documento 
            FileReader fr = new FileReader("datosRandom.txt");
            BufferedReader bf = new BufferedReader(fr);
            //bucle para hacer las funciones dependiendo de las lineas del documento
            while ((sCadena = bf.readLine())!=null) {       
                System.out.println(sCadena);
            } 
        //Sirve si algun dato del documento no sirva
        }catch(Exception e){
            System.out.println("Documento no encontrado o dañado :( por favor verificar");
            }
        System.out.println("Gracias por esperar");
    }
}