package com.exercise.deleteRepeatLetters;

/**
 * Created by Joe on 18/7/13.
 */
public class Main {
    public static int printArray(int[] array){
        int j = 0;
        for(int i =0;i<array.length;i++){
            if(array[i] != array[j]){
                j++;
                array[j]=array[i];
            }
        }
        return j+1;
    }

    public static void main(String args[]){
        int[] arr = {1,1,2,3,4,4};
        int len = printArray(arr);
        for(int i = 0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
