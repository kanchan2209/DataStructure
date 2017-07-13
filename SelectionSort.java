/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.util.Scanner;

/**
 *
 * @author kanch
 */
public class SelectionSort {
    /* Implementing Sorting Algorithm
     Complexity is n^2
    eg: 7 8 5 4 9 2
    first elecment is selected = 7; min = a[0] then compared with all element
    to find the min in this case 2 and then swapped with 7
    so 1st iteration has 2 8 5 4 9 7
    next interation starts from i = 2 that is 8 min = 8 and then compared
    and next minimum value is searched amonst it that is 4 and so on...
    2 4 5 8 9 7
   */
    
    public  static void sorting(int len, int[] arr){
        int temp = 0;
        int min = 0;
        for (int i=0; i < len-1; i++){
            min = i;
            for(int j = i+1;j<len;j++){
                if (arr[j] < arr[min]){
                    min = j;
                 }
                //swap arr[i] with arr[min]
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
                
            }
        }
             
        
        System.out.println("Here is the Sorted Array");
        for (int i =0; i < len; i++){
            System.out.println(arr[i]+ "\t");
        }
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ask the user  to enter the length of the Array to be sorted
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the length of the Array");
        int arrayLength = in.nextInt();
        int[] selectSortArray = new int[arrayLength];
        System.out.println("Please enter Array Element");
        for (int i = 0;i < arrayLength; i++){
            selectSortArray[i] = in.nextInt();
         }
        sorting(arrayLength,selectSortArray );
        
    }
    
}
