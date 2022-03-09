package com.questions.hard;

public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(print(str, ""));
    }

    static int count = 0;

    public static int print(String s, String a) {
        if (s.length() == 0) {
            count++;
            System.out.println(a);

        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String sl = s.substring(0, i);
            String sr = s.substring(i + 1);

             print(sl + sr, a + c);


        }
 return count;

    }

}
