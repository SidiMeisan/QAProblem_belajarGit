package PreperationpartA.Class;

public class palindrome {
    private static boolean palindrome(String value) {
        // your code here
        String ini = value.toLowerCase();
        StringBuilder balik=new StringBuilder(ini).reverse();
        return ini.equals(balik.toString());
    }

    public static void pal(){
        System.out.println(palindrome("Ini"));         // true
        System.out.println(palindrome("katak"));       // true
        System.out.println(palindrome("kasur rusak")); // true
        System.out.println(palindrome("kupu-kupu"));   // false
        System.out.println(palindrome("lion"));        // false
    }
}
