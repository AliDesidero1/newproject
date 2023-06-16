package ch10_MethodCreation;

import java.util.Scanner;

public class C05_SwitchCaseMethods {// CRUD class taki methodlari buradan switch ize edecegiz .

    // karsilama methodu yazalim .
    public static void menu() {
        System.out.println("sistemimize hosgeldin");
        System.out.println("uygulamaya kayıt olmak için 1 \nkullanici sorgulamak için 2 \n" +
                "kullanıcı bılgı guncelleme ıcın 3 \nkullanıcı sılme ıcın 4 \ncıkıs ıslemlerı ıcın 5e basınız ");

        Scanner in = new Scanner(System.in);
        int secim = in.nextInt();
        switch (secim) {
            case 1:
                createuser();
                menu();
                break;
            case 2:
                C05_CRUD.getUser();
                menu();
                break;
            case 3:
                C05_CRUD.updateUser();
                menu();
                break;
            case 4:
                C05_CRUD.deleteUser();
                menu();
                break;
            case 5:
                C05_CRUD.cıkıs();
                break;
            default:
                System.out.println("hatali bir secim yaptiniz :");
                menu();
                break;

        }
    }

    private static void createuser() {
    }
}

