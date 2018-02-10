
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
    public static void gnomeSort(int[]datos)
    {
      int i=1;
      int j=2;

      while(i < datos.length) {
        if ( datos[i-1] <= datos[i] ) {
          i = j; j++;
        } else {
          int tmp = datos[i-1];
          datos[i-1] = datos[i];
          datos[i--] = tmp;
          i = (i==0) ? j++ : i;
        }
      }
    }
    
    
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    public void merge(int[]datos, int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = datos[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = datos[m + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                datos[k] = L[i];
                i++;
            }
            else
            {
                datos[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            datos[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            datos[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    public void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
 
    /* A utility function to print array of size n */
    public static void printArray(int datos[])
    {
        int n = datos.length;
        for (int i=0; i<n; ++i)
            System.out.print(datos[i] + " ");
        System.out.println();
    }
 
    
}