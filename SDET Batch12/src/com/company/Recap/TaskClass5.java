package com.company.Recap;

public class TaskClass5 {
    public static void main(String[] args) {
        //How would you check if String is palindrome or not?
        // aba=> true ------> true aba
        //Abbc =>false-------> false cbbA
        TaskClass5 task=new TaskClass5();
        System.out.println(task.isPalindrome("aba"));
        System.out.println(task.isPalindrome("Abbc"));
    }
    boolean isPalindrome(String inputStr) {
        String reversedStr=reverseString(inputStr);
        return reversedStr.equals(inputStr);

    }

    String reverseString(String inputString) {
        StringBuilder stringBuilder=new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();

    }
}
