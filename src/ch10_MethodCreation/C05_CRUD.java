package ch10_MethodCreation;

import java.util.Scanner;

public class C05_CRUD {
        // biz burada methodlar create edicegiz .
        // buradaki methodlari Runner class dan ve switch classdan  calistiracagiz .
        // buradaki methodlar ihtiyaç oldugunda istenen yerden call edilebilir .
        // bu methodlari call edeceginiz yerde main method olmali .

    static Scanner input = new Scanner(System.in) ;// class levelda tanimlandi .
    static String staticUserName = "" ; // kullanicidan alinan user name i kayit etmek için kullanildi .
    public static void createUser () {
        // Methoda yazarsak her methoda tek tek yazmak gerekir .
        // Scanner input = new Scanner (System.in) ;
        System.out.println("user name gir : ");
        String userName = input.nextLine(); // bu method için create edildi .

        staticUserName = userName ; // kullanicinin girdigi user name bizdeki static olan variable atandi.
        // cunku asagidaki methodlarda kullanici kontrolü yapilip true ise isleme alinacaktir .

        System.out.println("create edilen userName = " + userName );
        System.out.println(userName + "isimli kullanici sisteme kayit oldu ");

    }
    public static void getUser() { // kullanici isim girmeli bu isme göre bir kontrol yapilip kullaniciya true false dönmeli .

        System.out.println("sorgulamak istedigin user name gir : ");
        String userName = input.nextLine();
        if(userName.equals(staticUserName)) {
            System.out.println(userName + "isimli kullanici sistemde mevcut ");
        }else System.out.println(userName + "isimli kullanici sistemde mevcut DEGIL 404 not found ");

    }
    public static void updateUser(){ // burada kullanici kendi ismini update edicek.
        System.out.println("suanki mevcut isminiz " + staticUserName);
        System.out.println("yeni ismini gir ");
        String yeniIsim= input.nextLine();

        staticUserName = yeniIsim ;
        System.out.println("isim güncelleme basarili 200 ok ");
        System.out.println("yeni isminiz " + staticUserName) ;
    }
    public static void deleteUser () {
        System.out.println("silmek istedigin ismi gir : ");

        String silinecekIsim = input.nextLine() ;
        if (silinecekIsim.equals(staticUserName)) {// kullanicidan alinan isim esit ise sistemde kayitli olan staticusername  e .
            System.out.println(staticUserName + " isimli kullanici sistemden silindi ");
            staticUserName = null;
            System.out.println("silinen isim " + silinecekIsim);
        }else System.out.println(silinecekIsim+ "isimli kullanici sistemde mevcut DEGIL 404 not found");
    }
    public static void cıkıs () {


    }

    }

