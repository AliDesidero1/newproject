package Challange06;

import java.util.Scanner;

public class Task07 {


    // Task-> Girilen bir stringin harflerini teker teker ekrana alt alta olacak
    // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir string giriniz : ");
        String cizik = input.nextLine();

        for (int i = 0; i < cizik.length(); i++) {
            if (cizik.charAt(i) == 'a' || cizik.charAt(i) == ' ') { // girilen ifadede a veya " " kontrolü
                continue; // if sarti true verdiginde döngü bu tekrari pass geçip diğer tekrardan devam eder.

            }
            System.out.println(cizik.charAt(i));
        }
    }
}
