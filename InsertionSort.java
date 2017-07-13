/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

import java.util.Scanner;

/**
 *
 * @author kanch
 */
public class InsertionSort {

    public  static void sorting(int len, int[] arr){
        int temp = 0;
        int key = 0;
        for (int i=0; i < len; i++){
            key = arr[i];
            for(int j = i-1;j>=0;j--){
                if (arr[j] > key){
                 //swap arr[i] with arr[min]
                temp = arr[j];
                arr[j] = key;
                arr[j+1] = temp;
                } 
            }
        }  
                System.out.println("Here is the Sorted Array");
        for (int i =0; i < len; i++){
            System.out.println(arr[i]+ "\t");
        }
       
    }
    public static void main(String[] args) {
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
