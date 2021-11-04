package PreperationpartB;

public class Exponentiation {
    private static int pangkat(int a, int b) {
        // your code here
        return (int)Math.pow(a, b);
    }
    public static void main() {
        System.out.println(pangkat(2, 3));  // 8
        System.out.println(pangkat(5, 3));  // 125
        System.out.println(pangkat(10, 2)); // 100
        System.out.println(pangkat(2, 5));  // 32
        System.out.println(pangkat(7, 3));  // 343
    }
}
