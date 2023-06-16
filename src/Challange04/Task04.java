package Challange04;

import java.util.Scanner;

public class Task04 {

    /* Task->
     * Girilen  bir kelime 3 ve daha fazla harfden olusuyorsa son
     * iki harfini 3 kere yan yana  degil ise girilen kelimeyi print eden code create ediniz.
     *
     * ornek
     * input = Ali
     * output = lilili
     *
     * input = el
     * output = el
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("bir string giriniz :");
        String str = scan.next();
        String  sonIki = str.substring(str.length()-2);
        if(str.length()>=3){
            System.out.println(sonIki+sonIki+sonIki);
        }else System.out.println(str);


    }
}
