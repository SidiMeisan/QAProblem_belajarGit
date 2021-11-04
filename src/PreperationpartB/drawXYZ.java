package PreperationpartB;

public class drawXYZ {
    private static void DrawXYZ(int n) {
        // your code here
        StringBuilder result = new StringBuilder();
        int hitung = 1;
        for (int baris = 1;baris <= n; baris++) {
            for (int bintang = 1; bintang <= (n * 2) - 1; bintang++) {
                if (bintang%2==0)
                    result.append(" ");
                else{
                    if (hitung%3==0)
                        result.append("X");
                    else if(hitung%2==0)
                        result.append("Z");
                    else
                        result.append("Y");
                    hitung += 1;
                }
            }
            result.append(System.lineSeparator());
        }
        System.out.println(result.toString());
    }
    public static void main() {
        DrawXYZ(3);
       /*
       Y Z X
       Z Y X
       Y Z X
       */
        DrawXYZ(5);
       /*
       Y Z X Z Y
       X Y Z X Z
       Y X Y Z X
       Z Y X Y Z
       X Z Y X Y
       */
        DrawXYZ(1);
        // Y
    }
}
