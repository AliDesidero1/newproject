package Challange03;

import java.util.Scanner;

public class Task01_NestedIfStatement {
    /* Task->
       Girilen  yas data için
            oy kullanma yasi :
             age >= 18  ==> oy kullanmaya uygun
             age >= 70  ==> uc kez oy kullanabilir
             70 > age >=50 ==> iki kez oy kullanabilir
             50 > age >=18 ==> bir kez oy kullanabilir,
             print eden code create ediniz...
         */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Aslanım  hele bir yasını gir baken : ");

        int aslanYası = input.nextInt();

        if (aslanYası >= 18) {//genel şart kontrolu
            System.out.println("oy kullanmaya uygun");
            if (aslanYası >= 70) {//genelşartın true halinde özel şart kontrolu
                System.out.println("uc kez oy kullanabilir");
            } else if (aslanYası >= 50 && aslanYası < 70) {
                System.out.println("iki kez oy kullanabilir");
            } else if (aslanYası >=18 && aslanYası < 50) {
                System.out.println("bir kez oy kullanabilir");
            }
        }else System.out.println("hatalı giriş ");

    }// main sonu

}