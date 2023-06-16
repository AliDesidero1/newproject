package Challange04;

import java.util.Scanner;

public class Task12 {
    // Task-> Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Task-> Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int bosluk = str.indexOf(" ");

        if(bosluk ==-1  && !str.isEmpty())  //bosluk karakteri yoksa ve string ifadem bos degilse
            System.out.println("sartlara uygun");
        else System.out.println("sartlara uygun degildir");


        //2.yol
        System.out.print("Bir string giriniz = "); // Java ogren
        String text = scan.nextLine();

        boolean boslukVarMi = text.contains(" ");
        System.out.println("boslukVarMi = " + boslukVarMi); //boslukVarMi = true
    }
}