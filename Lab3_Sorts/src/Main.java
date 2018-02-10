
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
        Sort sorts = new Sort();
        
        
        sorts.llenar("random.txt");
        
        System.out.println("Bienvenido");
        
        System.out.println("Array Before Bubble Sort");  
        for(int item=0; item < sorts.datos.length; item++){  
                System.out.print(sorts.datos[item] + " ");  
        }  
        System.out.println();         
        sorts.bubbleSort(sorts.datos);//sorting array elements using bubble sort
        
        System.out.println("Array After Bubble Sort");  
                for(int i=0; i < sorts.datos.length; i++){  
                        System.out.print(sorts.datos[i] + " ");  
                }  
                //Merge
        System.out.println();         
        sorts.mergeSort(sorts.datos);//sorting array elements using bubble sort
        
        System.out.println("Array After merge Sort");  
                for(int i=0; i < sorts.datos.length; i++){  
                        System.out.print(sorts.datos[i] + " ");  
                }
    }  
}