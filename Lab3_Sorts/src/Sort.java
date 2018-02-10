
import java.io.*;
import java.util.*;

/**
 * @author Luis Esturban 17256
 * @author Gustavo De Leon 17085
 */
public class Sort {
    //Crea la lista para los 3000 datos
     public int[] datos=new int[3000];
    //Get para los datos de la lista 
     public int[] getDatos() {
        return datos;
    }
     //Set para los datos de la lista
    public void setDatos(int[] datos) {
        this.datos = datos;
    }
    //Metodo para crear el archivo con los numeros random
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
    //Crea los numeros hasta llenar los 3000
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
    //----------------------------------------------------------------------------------------------------------------------
    /**
    *El metodo de burbuja consiste en comparar el primero con el segundo, si el segundo es 
    *menor que el primero se intercambian los valores. Después el segundo con el tercero y 
    *así sucesivamente, cuando no haya ningún intercambio, el array estará ordenado.
    */
    public  void bubbleSort(int[]datos){  
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
    //----------------------------------------------------------------------------------------------------------------------
    /**
    *El algoritmo es similar a la ordenación por inserción , excepto que , en lugar de 
    *insertar directamente el elemento a su lugar apropiado , el algoritmo realiza una 
    *serie de permutaciones como en el ordenamiento de burbuja. 
    */
    public static void gnomeSort(int[]datos){
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
    //----------------------------------------------------------------------------------------------------------------------
    //Metodo complementario para Mergesort
    public void merge(int[]datos, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int [n1];
        int R[] = new int [n2];
        for (int i=0; i<n1; ++i)
            L[i] = datos[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = datos[m + 1+ j];
        int i = 0, j = 0;
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
        while (i < n1)
        {
            datos[k] = L[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            datos[k] = R[j];
            j++;
            k++;
        }
    }
    /**
     *El metodo de Mergesort Consiste en dividir el problema a resolver en subproblemas
     *del mismo tipo que a su vez se dividirán, mientras no sean suficientemente pequeños 
     *o triviales. 
    */
    public void sortMERGE(int arr[], int l, int r)
    {
        if (l < r)
        {
            int m = (l+r)/2;
            sortMERGE(arr, l, m);
            sortMERGE(arr , m+1, r);
            merge(arr, l, m, r);
        }
    }
    //----------------------------------------------------------------------------------------------------------------------
    /**
     *El metodo de Radixsort es un algoritmo de ordenamiento que ordena enteros procesando
     *sus dígitos de forma individual. Como los enteros pueden representar cadenas de caracteres
     *(por ejemplo, nombres o fechas) y, especialmente, números en punto flotante especialmente 
     *formateados, radix sort no está limitado sólo a los enteros.
    */
    public  void radixSort() {
	  	final int RADIX = 10;
	  	List<Integer>[] bucket = new ArrayList[RADIX];
	  	for (int i = 0; i < bucket.length; i++) {
	    	bucket[i] = new ArrayList<Integer>();
	  	}
	  	boolean maxLength = false;
	  	int tmp = -1, placement = 1;
	  	while (!maxLength) {
	    	maxLength = true;
	    	for (int i : datos) {
	      		tmp = i / placement;
	      		bucket[tmp % RADIX].add(i);
	      		if (maxLength && tmp > 0) {
	        		maxLength = false;
	      		}
	    	}
	    	int a = 0;
	    	for (int b = 0; b < RADIX; b++) {
	      		for (Integer i : bucket[b]) {
	        		datos[a++] = i;
	      		}
	      		bucket[b].clear();
	    	}
	    	placement *= RADIX;
	  	}
    }
    //----------------------------------------------------------------------------------------------------------------------
    //Metodo complementario para Quicksort
    int partition(int datos[], int left, int right)
    {
        int i = left, j = right;
        int tmp;
        int pivot = datos[(left + right) / 2]; 
        while (i <= j) {
                while (datos[i] < pivot)
                      i++;
                while (datos[j] > pivot)
                      j--;
                if (i <= j) {
                    tmp = datos[i];
                    datos[i] = datos[j];
                    datos[j] = tmp;
                    i++;
                    j--;
                }
        }; 
        return i;
    }
    /**
     *El metodo de Quicksort consiste en ordenar un array mediante un pivote, que es un punto
     *intermedio en el array, es como si se ordenaran pequeños trozos del array, haciendo que
     *a la izquierda esten los menores a ese pivote y en la derecha lo mayores a este, después
     *se vuelve a calcular el pivote de trozos de listas. 
    */
    public void quickSort(int left, int right) {
        int index = partition(datos, left, right);
        if (left < index - 1)
            quickSort(left, index - 1);
        if (index < right)
            quickSort(index, right);
    }
    //----------------------------------------------------------------------------------------------------------------------
}