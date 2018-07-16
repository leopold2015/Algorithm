package com.exercise.ReserveNumber;

import java.util.Scanner;

/**
 * Created by Joe on 18/7/16.
 */
public class Main {

    public static int reserveNum(int num){
        if(num<0){
            num = -num;
        }
        int resnum = 0;
        while(num >=1){
            if(num % 10 != 0){
                resnum = resnum * 10 + num % 10;
                num = num /10;
            }else{
                num = num /10;
            }
        }
        return resnum;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.print(reserveNum(num));
    }
}
