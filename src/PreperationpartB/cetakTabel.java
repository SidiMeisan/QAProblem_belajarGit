package PreperationpartB;

public class cetakTabel {
    private static void cetakTablePerkalian(int n) {
        // your code here
        if(n >=1 && n<=30){
            StringBuilder result = new StringBuilder();
            int hitung,hasil;
            for (int baris = 1;baris <= 9; baris++) {
                hitung = 1;
                for (int kolom = 1; kolom <= (9 * 2) - 1; kolom++) {
                    if (kolom%2==0)
                        result.append(" ");
                    else{
                        hasil = baris*hitung;
                        if(hasil<10)
                            result.append(hasil+" ");
                        else
                            result.append(hasil);
                        hitung+=1;
                    }
                }
                result.append(System.lineSeparator());
            }
            System.out.println(result.toString());
        }else
            System.out.println("Invalid");
    }
    public static void main() {
        cetakTablePerkalian(3);
        // 1  2  3  4  5  6  7  8  9
        // 2  4  6  8  10 12 14 16 18
        // 3  6  9  12 15 18 21 24 27
        // 4  8  12 16 20 24 28 32 36
        // 5  10 15 20 25 30 35 40 45
        // 6  12 18 24 30 36 42 48 54
        // 7  14 21 28 35 42 49 56 63
        // 8  16 24 32 40 48 56 64 72
        // 9  18 27 36 45 54 63 72 81
    }
}
