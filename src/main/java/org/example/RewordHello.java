package org.example;

public class RewordHello {
    public static char[] reword(String input) {
        char[] strToChar =input.toCharArray();
        char[] a=new char[strToChar.length];

        for (int i = a.length-1;i>=0;i--){
            a[i]=strToChar[(a.length-1)-i];
        }
      return a;
    }
}
