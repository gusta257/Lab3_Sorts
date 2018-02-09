/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_sorts;

import java.io.*;
import java.util.*;

/**
 *
 * @author Gustavo
 */
public class Sort {
     public Comparable[] datos=new Comparable[3000];
    
     public Comparable[] getDatos() {
        return datos;
    }

    public void setDatos(Comparable[] datos) {
        this.datos = datos;
    }
 
    public void llenar(String texto) {
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;

        try{
        f= new File(texto);
        w = new FileWriter(f);
        bw = new BufferedWriter(w);
        wr = new PrintWriter(bw);
        Random aleatorio = new Random();
        
        for(int i=0; i<2999; i++){
            datos[i] = aleatorio.nextInt(3001);
            int x = (int) datos[i];
            wr.println(String.valueOf(x));
        }
        wr.close();
        bw.close();
        }catch(IOException e){
            System.out.println("Hubo un error");
        }
    } 

    public void bubbleSort(Comparable[]datos) {  
        int n = datos.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(datos[j-1].compareTo(datos[j]) <0 ){  
                    //swap elements  
                    temp = (int) datos[j-1];  
                    datos[j-1] = datos[j];  
                    datos[j] = temp;  
                }               
            }  
        }
        for(int item=0; item < datos.length; item++){  
                System.out.println(datos[item] + " ");  
        }
    }
}
