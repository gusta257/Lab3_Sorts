/**
 * @author Gustavo De Leon 17085
 * @author Luis Esturban 17256
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Sort sorts = new Sort();
        //Llena el archivo con los datos
        sorts.llenar("random.txt");
//---------------------------------------------------------------------------------------------------------------------- 
        System.out.println("Bienvenido");
        //Muestra el Array principal
        System.out.println("Lista Principal ");  
        for(int item=0; item < sorts.datos.length; item++){  
                System.out.print(sorts.datos[item] + " ");  
        }  
//----------------------------------------------------------------------------------------------------------------------         
        System.out.println();         
        sorts.bubbleSort(sorts.datos);
        //Muestra la lista ordenada con Bubble Sort
        System.out.println("Lista ordenada con Bubble Sort");  
                for(int i=0; i < sorts.datos.length; i++){  
                        System.out.print(sorts.datos[i] + " ");  
                }  
//---------------------------------------------------------------------------------------------------------------------- 
        System.out.println();         
        sorts.gnomeSort(sorts.datos);
        //Muestra la lista ordenada con Gnome Sort
        System.out.println("Lista ordenada Gnome Sort");  
                for(int i=0; i < sorts.datos.length; i++){  
                        System.out.print(sorts.datos[i] + " ");  
                }  
//---------------------------------------------------------------------------------------------------------------------- 
        System.out.println();         
        sorts.sortMERGE(sorts.datos,0,2999);
        //Muestra la lista ordenada con Merge Sort
        System.out.println("Lista ordenada Merge Sort");  
                for(int i=0; i < sorts.datos.length; i++){  
                        System.out.print(sorts.datos[i] + " ");  
                }  
//---------------------------------------------------------------------------------------------------------------------- 
        System.out.println();      
        sorts.radixSort();
        //Muestra la lista ordenada con Radix Sort
        System.out.println("Lista ordenada Radix Sort");  
                for(int i=0; i < sorts.datos.length; i++){  
                        System.out.print(sorts.datos[i] + " ");  
                }  
//---------------------------------------------------------------------------------------------------------------------- 
        System.out.println();         
        sorts.quickSort(0,sorts.datos.length-1);
        //Muestra la lista ordenada con Quick Sort
        System.out.println("Lista ordenada Quick Sort");  
                for(int i=0; i < sorts.datos.length; i++){  
                        System.out.print(sorts.datos[i] + " ");  
                }  
    }  
}