package com.exercise.ReserveNumber;

import java.util.Scanner;

/**
 * Created by Joe on 18/7/16.
 */
public class Main {

    public static int reserveNum(int num){
        int resnum = 0;
        boolean flag = true;
        if(num % 10 == 0){
            num = num / 10;
        }else if(num < 0){
            num = - num;
            flag = false;
        }
        while(Math.abs(num) >=1){
            resnum = resnum * 10 + num % 10;
            num = num /10;
        }
        return flag?resnum:-resnum;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.print(reserveNum(num));
    }
}
