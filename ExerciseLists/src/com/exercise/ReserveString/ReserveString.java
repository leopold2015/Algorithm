package com.exercise.ReserveString;

import java.util.Scanner;

/**
 * Created by Joe on 18/7/8.
 */
public class ReserveString {
    public static boolean jundgeSring(String string){
        int halfLen = string.length()/2;
        for(int i = 0;i<halfLen;i++){
            if(string.charAt(i) != string.charAt(string.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        System.out.println(jundgeSring(string));
    }
}
