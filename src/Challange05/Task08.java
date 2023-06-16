package Challange05;

import java.util.Scanner;

public class Task08 {

    // Kullanicidan iki sayi isteyin.
    // Girilen sayilar ve aralarindaki tum
    // tamsayilari toplayip, sonucu yazdiran bir program yaziniz
   /*
   Task-> Girilen iki tamsayı arasındaki sayıların toplamını print eden code create ediniz.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        int toplam = 0;

        if (sayi1 < sayi2) {
            for (int i = sayi1; i <= sayi2; i++) {
                toplam += i;
            }

            System.out.println(sayi1 + " ile " + sayi2 + " arasindaki sayilarin toplami :" + toplam);
        } else if (sayi1 > sayi2) {
            for (int i = sayi2; i <= sayi1; i++) {
                toplam += i;
            }

            System.out.println(sayi1 + " ile " + sayi2 + " arasindaki sayilarin toplami :" + toplam);
        } else {
            System.out.println("sayilar esittir");
        }
    }


}
