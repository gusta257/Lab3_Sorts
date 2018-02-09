/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_sorts;

/**
 *
 * @author Gustavo
 */
public class Sort {
    private int[] arrays;
    
   
    public int[] getArrays() {
        return arrays;
    }

    public void setArrays(int[] arrays) {
        this.arrays = arrays;
    }
    
            
    public void bubbleSort(int[] arr) {
      boolean cambios = false;
      int aux;
      while (true) {
            cambios = false;
            
            for (int i = 0; i < arr.length; i++) {                                       
                  if (arr[i] < arr[i - 1]) {                          
                        aux = arr[i];
                        arr[i] = arr[i - 1];
                        arr[i - 1] = aux;
                        cambios = true;
                  }
            }   
            if(cambios=false)
                break;
      }
      //return arr;
    }
}
