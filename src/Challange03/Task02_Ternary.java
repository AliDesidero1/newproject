package Challange03;

import java.util.Scanner;

public class Task02_Ternary {
    /* Task->
     * Girilen fiyat için
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * print eden code create ediniz
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Aslanım  hele bir fiyatını gir baken : ");

        double aslanFiyatı = input.nextDouble();


        // şart          ise   true   değilse   false
        System.out.println(aslanFiyatı < 10 ? "ucuz" : (aslanFiyatı >= 10 && aslanFiyatı < 20 ? "normal" : "pahali"));
        String sonuç = aslanFiyatı < 10 ? "ucuz" : (aslanFiyatı >= 10 && aslanFiyatı < 20 ? "normal" : "pahali");
        System.out.println("sonuç = " + sonuç);
    }
}
