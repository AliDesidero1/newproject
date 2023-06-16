package Challange05;

public class Task01 {

    /*
        Task-> 100'den 0'a kadar 13'e tam bölünebilen sayıları (büyükten küçüğe) ve toplamını print eden code create edinz.
      output :
         91
         78
         65
         52
         39
         26
         13
         toplam =364
         */

    public static void main(String[] args) {

        int toplam=0;// döngüdeki 13 e bölünen sayıların toplanacagı boş container kutu atandı
        for (int i = 100; i >0; i--) {//başlangıc değeri 100 bitiş değeri o olan 1 azalan döngü tanımlandı

            if (i %13==0) {// döngüden gelen her bir sayı 13'e tam bölünme şartı
                System.out.println(i);
                toplam+=i;// 13 e tam bölünen döngü sayıları toplama eklendi
            }

        }
        System.out.println("13 e tam bölünen sayı toplamı : "+toplam);

    }
}
