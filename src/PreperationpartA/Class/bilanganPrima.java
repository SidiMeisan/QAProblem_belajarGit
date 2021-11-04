package PreperationpartA.Class;

public class bilanganPrima {
    private static boolean primeNumber(int number) {
        // your code here
        if (number<2)
            return false;

        int hitungFaktor  = 0;
        for (int i = number; i >= 1; i--)
            if (number%i == 0)
                hitungFaktor+=1;

        if (hitungFaktor==2)
            return true;
        else
            return false;
    }

    public static void bilangan(){
        System.out.println(primeNumber(10)); // true
        System.out.println(primeNumber(13)); // true
        System.out.println(primeNumber(17)); // true
        System.out.println(primeNumber(20)); // false
        System.out.println(primeNumber(35)); // false
    }
}
