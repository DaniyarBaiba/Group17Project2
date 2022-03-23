package com.company.Recap;

public class TaskClass3 {
    public static void main(String[] args) {
        //You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        // How would you find out how many sentences are in that String?
        String a="Is it Satrday? Is it raining? Do you have a Java Class today ";
        System.out.println(a.length());
        System.out.println(a.split("[?]").length);

    }
}
