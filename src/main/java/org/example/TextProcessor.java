package org.example;

public class TextProcessor {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(vend("hej"));
    }

    public static String versialer(String s){


        return s.toUpperCase();
    }

    public static String gemener(String s){

        return s.toLowerCase();
    }
    public static String vend(String s){
        StringBuilder str
                = new StringBuilder();

        str.append(s);
        str.toString();
        StringBuilder reverseStr = str.reverse();

        return reverseStr.toString();

    }
}
