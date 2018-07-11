package com.exercise.LengthOfMaxSubString;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Joe on 18/7/11.
 */
public class Main {
    public static int printLengthOfSubString(String string){
        int n = string.length();
        int ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i =0, j=0;j<n;j++){
            if(!map.containsKey(string.charAt(j))){
                ans = ans > j-i+1? ans:j-i+1;
                map.put(string.charAt(j),j+1);
            }else{
                i = map.get(string.charAt(j));
            }
        }
        return ans;
    }

    public static void main(String args[]){
        String string = "babvcb";
        System.out.println(printLengthOfSubString(string));
    }
}
