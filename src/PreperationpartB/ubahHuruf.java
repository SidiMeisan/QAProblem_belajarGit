package PreperationpartB;

public class ubahHuruf {
    private static String ubahHuruf(String s) {
        // your code here
        StringBuilder result = new StringBuilder();
        String ini = s.toUpperCase();
        char karakterIni;
        char[] hurufArray = new char[]
                {
                        'A','B','C','D','E','F',
                        'G','H','I','J','K','L',
                        'M','N','O','P','Q','R',
                        'S','T','U','V','W','X',
                        'Y','Z'
                };

        for (int i = 0; i < ini.length(); i++) {
            karakterIni = ini.charAt(i);
            if(karakterIni == ' ')
                result.append(' ');
            else {
                for (int hitungHuruf = 0; hitungHuruf < 26; hitungHuruf++) {
                    if (karakterIni == hurufArray[hitungHuruf]) {
                        if (hitungHuruf + 10 > 26)
                            result.append(hurufArray[(hitungHuruf + 10) - 26]);
                        else
                            result.append(hurufArray[(hitungHuruf + 10)]);
                    }
                }
            }
        }
        return result.toString();
    }
    public static void main() {
        System.out.println(ubahHuruf("SEPULSA OKE"));     // COZEVCK YUO
        System.out.println(ubahHuruf("ALTERRA ACADEMY")); // KVDOBBK KMKNOWI
        System.out.println(ubahHuruf("INDONESIA"));       // SXNYXOCSK
        System.out.println(ubahHuruf("GOLANG"));          // QYVKXQ
        System.out.println(ubahHuruf("PROGRAMMER"));      // ZBYQBKWWOB
    }
}
