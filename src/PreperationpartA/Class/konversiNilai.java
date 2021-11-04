package PreperationpartA.Class;

public class konversiNilai {
    public static void convert(){
        // Daftar Nilai
        // 80 sampai 100 : A
        // 65 sampai 79  : B+
        // 50 sampai 64  : B
        // 35 sampai 49  : C
        // 0 sampai 34   : D

        // input
        int studentScore = 80;

        // Process: Your Solution Code Here
        String Nilai;
        if (studentScore >= 80 && studentScore <= 100 )
            Nilai = "A";
        else if (studentScore >= 65 && studentScore <= 79)
            Nilai = "B+";
        else if (studentScore >= 50 && studentScore <= 64)
            Nilai = "B";
        else if (studentScore >= 35 && studentScore <= 49)
            Nilai = "C";
        else if (studentScore >= 0 && studentScore <= 34)
            Nilai = "D";
        else
            Nilai  = "Invalid";

        // Output
        // Nilai A
        System.out.println("Nilai "+Nilai);
    }
}
