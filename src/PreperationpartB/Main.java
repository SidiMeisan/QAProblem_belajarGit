package PreperationpartB;

import PreperationpartA.Class.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Menu untuk tugas hari pertama
        int userPick = 0;
        // Create a Scanner object
        Scanner myObj = new Scanner(System.in);
        boolean loopTrue = true;
        while(loopTrue==true){
            System.out.println("***************");
            System.out.println("Problem:");
            System.out.println("***************");
            System.out.println("1. Exponentiation");
            System.out.println("2. Play With Asterisk");
            System.out.println("3. Draw XYZ");
            System.out.println("4. Cetak Tabel Perkalian");
            System.out.println("5. Ubah Huruf");
            System.out.println("6. Mean");
            System.out.println("0. Exit");
            System.out.println("***************");

            System.out.println("Pick Problem: ");
            // Read user input
            userPick = myObj.nextInt();
            switch (userPick){
                case 1:
                    Exponentiation.main();
                    break;
                case 2:
                    playAsterisk.main();
                    break;
                case 3:
                    drawXYZ.main();
                    break;
                case 4:
                    cetakTabel.main();
                    break;
                case 5:
                    ubahHuruf.main();
                    break;
                case 6:
                    Mean.main();
                    break;
                case 0:
                    loopTrue=false;
                    break;
                default:
                    System.out.println("Please pick one of the menu");
                    System.out.println("");
                    break;
            }
        }
    }
}
