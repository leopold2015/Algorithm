package com.exercise.ReserveString;

import java.util.Scanner;

/**
 * Created by Joe on 18/7/8.
 */
public class ReserveNumber {
    public static boolean jundgeNumber(int num){
        if(num < 0 || (num % 10 == 0 && num !=0)){
            return false;
        }
        int resNum=0;
        while(num > resNum){
            resNum = resNum * 10 + num % 10;
            num = num / 10;
        }
        return num == resNum || num == resNum/10;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(jundgeNumber(num));
    }
}
