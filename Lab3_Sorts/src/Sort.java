
import java.io.*;
import java.util.*;

/**
 *
 * @author Gustavo
 */
public class Sort {
     public int[] datos=new int[3000];
    
     public int[] getDatos() {
        return datos;
    }

    public void setDatos(int[] datos) {
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

    public  void bubbleSort(int[]datos) {  
        int aux;
        boolean cambios = false;
        while(true){
            cambios =false;
            for(int i=1; i < datos.length ; i++){  
                if(datos[i]<datos[i-1]){
                    aux = datos[i];
                    datos[i] = datos[i-1];
                    datos[i-1]=aux;
                    cambios=true;
                }
        }
            if(cambios==false)
                break;
   
        }
    }
}