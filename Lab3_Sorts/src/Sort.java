
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
    public int[] mergeSort(int[] input){
		
		if(input.length == 1){
			return input;
		}
		
		int middle = (int) Math.ceil((double)input.length / 2);
		int[] left = new int[middle];
		
		int rightLength = 0;
		if(input.length % 2 == 0){
			rightLength = middle;
		}
		else{
			rightLength = middle - 1;
		}
		int[] right = new int[rightLength];
		
		int leftIndex = 0; 
		int rightIndex = 0;
		
		for (int i = 0; i < input.length; i++) {
			if(i < middle){
				left[leftIndex] = input[i];
				leftIndex++;
			}
			else{
				right[rightIndex] = input[i];
				rightIndex++;
			}
		}
		
		left = mergeSort(left);
		right = mergeSort(right);
		
		return merge(left, right);
	}
	
	
	private int[] merge(int[] left, int[] right){
		int[] result = new int[left.length + right.length];
		int leftIndex = 0;
		int rightIndex = 0;
		int resultIndex = 0;
		
		while(leftIndex < left.length || rightIndex < right.length){
			if(leftIndex < left.length && rightIndex < right.length){
				if(left[leftIndex] < right[rightIndex]){
					result[resultIndex] = left[leftIndex];
					leftIndex++;
					resultIndex++;
				}
				else{
					result[resultIndex] = right[rightIndex];
					rightIndex++;
					resultIndex++;
				}
			}
			else if(leftIndex < left.length){
				for (int i = resultIndex; i < result.length; i++) {
					result[i] = left[leftIndex];
					leftIndex++;
				}
			}
			else if(rightIndex < right.length){
				for (int i = resultIndex; i < result.length; i++) {
					result[i] = right[rightIndex];
					rightIndex++;
				}
			}
		}
		
		return result;
	}
}