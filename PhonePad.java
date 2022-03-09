package com.recursion;

public class PhonePad {
    public static void main(String[] args) {
        pad("","12");
    }
    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit =up.charAt(0) - '0';//By subtracting it with the ASCII value of the '0' we convert the char to int
        for(int i = (digit-1) * 3; i < digit *3; i++){
            char c = (char)('a' + i);
            pad(p+c,up.substring(1));


        }

    }
}
