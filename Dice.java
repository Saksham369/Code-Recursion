package com.recursion;
// Asked in amazone
public class Dice {
    public static void main(String[] args) {
     print("",4);
    }

    static void print(String p, int tar){
        //common statement in pattern questions
        if(tar == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1; i<=6 && i <=tar; i++){
            print(p + i,tar -i);
        }



    }
}
