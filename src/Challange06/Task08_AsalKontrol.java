package Challange06;

import java.util.Scanner;

public class Task08_AsalKontrol {
    /*
 Task->
  Girilen sayının asal olup olmadığını kontrol eden code create ediniz.
   */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Agam hele bi sayi giresen : ");
        int sayi = input.nextInt(); // 7
        boolean asalMi = true;

        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0) {
                asalMi = false;
                break;
            }

        }if (asalMi) {
            System.out.println("girilen sayı ASAL :)");
        } else System.out.println("girilen sayı asal değil :( ");


    }


}