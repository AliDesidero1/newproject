package Challange05;

import java.util.Scanner;

public class Task04 {
   /* task-> girilen sayıdan 1'e kadar olan tamsıyalrın karelerinin toplamını print eden code create ediniz..
	    Örnek Ekran Çıktısı
	    Girilen sayı=4               1 -> 1  2-> 4  3->9
	    Kareler toplamı=14
	     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Agam bi sayı giresen hele :");

        int aganınSayısı = input.nextInt();
        int toplam = 0;// döngüdeki sayıları karelerini toplayacak boş kutu tanımlandı


        for (int i = aganınSayısı; i >= 1; i--) {
            toplam += i * i;// döngüden gelen hersayını karesi topama eklendi
        }
        System.out.println("agam girdiğin sayıları kareleri toplamı : " + toplam);

    }// main sonu
}// class sonu

