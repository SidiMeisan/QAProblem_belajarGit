package PreperationpartB;

public class Mean {
    private static float mean(float[] numbers) {
        // your code here
        float total = 0;
        for (int i = 0; i < numbers.length; i++)
            total = total + numbers[i];
        return total/numbers.length;
    }
    public static void main() {
        float[] value = {1, 2, 3, 4};
        System.out.println(mean(value)); // 2.5
    }

}
