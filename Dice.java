package com.recursion;
import java.util.*;
import.java.io.*;
// Asked in amazone
public class Dice {
    public static void main(String[] args) {
     System.out.println(print("",4));
    }

   /* static void print(String p, int tar){
        //common statement in pattern questions
        if(tar == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1; i<=6 && i <=tar; i++){
            print(p + i,tar -i);
        }



    }*/
    static ArrayList<String> print(String p, int tar){
        //common statement in pattern questions
        if(tar == 0){
          ArrayaList<String> list =  new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i<=6 && i <=tar; i++){
           list.addAll(print(p + i,tar - i));
        }


return list;
    
}
}
