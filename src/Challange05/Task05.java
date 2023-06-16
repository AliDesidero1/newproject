package Challange05;

import java.util.Scanner;

public class Task05 {
    /* task-> girilen satır ve sutun değerleri için aşağıdaki şekli print eden code create ediniz.
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Agam satır sayısı giresen hele :");

        int satir = input.nextInt();

        System.out.print("Agam sutun sayısı giresen hele :");

        int sutun = input.nextInt();


        for (int i = 1; i <= satir; i++) {// i=1...satır  satır kontrolu

            for (int j = 1; j <= sutun; j++) { //j=1...sutun kontrolu

                System.out.print("* ");

            }
            System.out.println();// dummy-! hayalet komut action almayan satır düzeni sağlar;

        }

    }


}
