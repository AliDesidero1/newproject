package Challange05;

import java.util.Scanner;

public class Task06 {
    /* Interview Question
    Write a Java program to reverse a string.
    Use for loop and create a method called reverseString */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Agam bişeyler giresen hele :");

        String kelime = input.next();


        for (int i = kelime.length() - 1; i >= 0; i--) {// girilen kelimenin son karaktyerinden ilk karakterine kdar döngü tanımlandı
            System.out.print(kelime.charAt(i));// döngüden gelen her bir karakter print edildi
        }
    }

}
