
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
        Sort bubble = new Sort();
        
        
        bubble.llenar("random.txt");
        
        System.out.println("Bienvenido");
        
        System.out.println("Array Before Bubble Sort");  
        for(int item=0; item < bubble.datos.length; item++){  
                System.out.print(bubble.datos[item] + " ");  
        }  
        System.out.println();         
        bubble.bubbleSort(bubble.datos);//sorting array elements using bubble sort
        
        System.out.println("Array After Bubble Sort");  
                for(int i=0; i < bubble.datos.length; i++){  
                        System.out.print(bubble.datos[i] + " ");  
                }    
        
        
    }  
}