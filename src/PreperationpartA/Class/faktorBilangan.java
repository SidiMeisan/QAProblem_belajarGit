package PreperationpartA.Class;

import java.util.Scanner;

public class faktorBilangan {
    public static void faktorUP(){
        System.out.println("");
        System.out.println("Faktor bilangan");
        System.out.println("");
        int bilangan;
        // Process: Your Solution Code Here

        Scanner scanBilangan = new Scanner(System.in);
        System.out.println("Input: ");
        // Read user input
        bilangan = scanBilangan.nextInt();
        while (bilangan<=0){
            System.out.println("Input: ");
            // Read user input
            bilangan = scanBilangan.nextInt();
        }
        System.out.println("Output:");
        for (int i = 1; i <= bilangan; i++)
            if (bilangan%i == 0)
                System.out.println(i);

        System.out.println("");
    }


    public static void faktorDOWN(){
        System.out.println("");
        System.out.println("Faktor bilangan");
        System.out.println("");
        int bilangan;
        // Process: Your Solution Code Here

        Scanner scanBilangan = new Scanner(System.in);
        System.out.println("Input: ");
        // Read user input
        bilangan = scanBilangan.nextInt();
        while (bilangan<=0){
            System.out.println("Input: ");
            // Read user input
            bilangan = scanBilangan.nextInt();
        }
        System.out.println("Output:");
        for (int i = bilangan; i >= 1; i--)
            if (bilangan%i == 0)
                System.out.println(i);

        System.out.println("");
    }
}
