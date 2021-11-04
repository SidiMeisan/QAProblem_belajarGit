package PreperationpartB;

public class playAsterisk {
    private static void playWithAsterik(int n) {
        // your code here
        StringBuilder result = new StringBuilder();
        for (int baris = 1;baris <= n; baris++) {
            for (int spasi = 1; spasi <= n - baris; spasi++)
                result.append(" ");

            for (int bintang = 1; bintang <= (baris * 2) - 1; bintang++) {
                if (bintang%2==0)
                    result.append(" ");
                else
                    result.append("*");
            }
            result.append(System.lineSeparator());
        }
        System.out.println(result.toString());
    }
    public static void main() {
        playWithAsterik(5);
    }

}
