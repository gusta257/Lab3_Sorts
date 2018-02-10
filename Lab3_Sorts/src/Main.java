
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
//---------------------------------------------------------------------------------------------------------------------- 
        System.out.println("Bienvenido");
        
        System.out.println("Array Before ");  
        for(int item=0; item < sorts.datos.length; item++){  
                System.out.print(sorts.datos[item] + " ");  
        }  
//----------------------------------------------------------------------------------------------------------------------         
        System.out.println();         
        sorts.bubbleSort(sorts.datos);//sorting array elements using bubble sort
        System.out.println("Array After Bubble Sort");  
                for(int i=0; i < sorts.datos.length; i++){  
                        System.out.print(sorts.datos[i] + " ");  
                }  
//---------------------------------------------------------------------------------------------------------------------- 
        System.out.println();         
        sorts.gnomeSort(sorts.datos);//sorting array elements using bubble sort
        System.out.println("Array After gnome Sort");  
                for(int i=0; i < sorts.datos.length; i++){  
                        System.out.print(sorts.datos[i] + " ");  
                }  /*
//---------------------------------------------------------------------------------------------------------------------- 
        System.out.println();         
        sorts.sort(sorts.datos,0,2999);//sorting array elements using bubble sort
        System.out.println("Array After Merge Sort");  
                for(int i=0; i < sorts.datos.length; i++){  
                        System.out.print(sorts.datos[i] + " ");  
                }  */
//---------------------------------------------------------------------------------------------------------------------- 
        System.out.println();      
        sorts.radixSort();//sorting array elements using bubble sort
        System.out.println("Array After radix Sort");  
                for(int i=0; i < sorts.datos.length; i++){  
                        System.out.print(sorts.datos[i] + " ");  
                }  
//---------------------------------------------------------------------------------------------------------------------- 
        System.out.println();         
        sorts.quickSort(0,sorts.datos.length-1);//sorting array elements using bubble sort
        
        System.out.println("Array After quick Sort");  
                for(int i=0; i < sorts.datos.length; i++){  
                        System.out.print(sorts.datos[i] + " ");  
                }  
    }  
    
    
}