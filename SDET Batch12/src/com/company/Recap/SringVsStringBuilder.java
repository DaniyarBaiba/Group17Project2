package com.company.Recap;

public class SringVsStringBuilder {
    public static void main(String[] args) {
        String s="Asghar is great";
        System.out.println(s.replace(" ", " "));
        System.out.println(s);

        StringBuilder stringBuilder=new StringBuilder("Asghar is great");
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder);
    }
}
