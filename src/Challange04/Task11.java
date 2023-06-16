package Challange04;

import java.util.Scanner;

public class Task11 {
    // Task-> Girilen  isim ve soyismini  hangisinin daha uzun oldugunu print eden code create ediniz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String isim = scan.next();
        String soyIsim = scan.next();


        if(isim.length()>soyIsim.length())
            System.out.println("isminiz daha uzun");
        else if(isim.length()==soyIsim.length())
            System.out.println("isim ve soyisim uzunluklari esit");
        else System.out.println("soyisminiz daha uzun");

    }

}