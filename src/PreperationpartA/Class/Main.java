package PreperationpartA.Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    // Menu untuk tugas hari pertama
        int userPick = 0;
        // Create a Scanner object
        Scanner myObj = new Scanner(System.in);

        boolean loopTrue = true;
        while(loopTrue== true){
            System.out.println("***************");
            System.out.println("Problem:");
            System.out.println("***************");
            System.out.println("1. Luas Segitga");
            System.out.println("2. Konversi Nilai");
            System.out.println("3. Faktor Bilangan");
            System.out.println("4. Faktor Bilangan II");
            System.out.println("5. Bilangan Prima");
            System.out.println("6. Palindrome");
            System.out.println("0. Exit");
            System.out.println("***************");

            System.out.println("Pick Problem: ");
            // Read user input
            userPick = myObj.nextInt();
            switch (userPick){
                case 1:
                    luasSegitiga.luas();
                    break;
                case 2:
                    konversiNilai.convert();
                    break;
                case 3:
                    faktorBilangan.faktorUP();
                    break;
                case 4:
                    faktorBilangan.faktorDOWN();
                    break;
                case 5:
                    bilanganPrima.bilangan();
                    break;
                case 6:
                    palindrome.pal();
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
