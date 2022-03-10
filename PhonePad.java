package com.recursion;
import java.util.*;
public class PhonePad {
    public static void main(String[] args) {
       System.out.println( pad("","12"));
    }
    static ArrayList<String> pad(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> s = new ArrayList<>(); //this is the main approach
            s.add(p);
            return s;
        }

        int digit =up.charAt(0) - '0';//By subtracting it with the ASCII value of the '0' we convert the char to int
        ArrayList<String> s = new ArrayList<>();

        for(int i = (digit-1) * 3; i < digit *3; i++){
            char c = (char)('a' + i);
            s.addAll(pad(p+c,up.substring(1)));


        }
return s;
    }
}
