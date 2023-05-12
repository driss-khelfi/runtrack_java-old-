import java.util.Arrays;
import java.util.Random;

public class job06 {
    public static void main(String[] args) {
        int[] montableau = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = rand.nextInt(100);
            montableau[i] = randomNumber;
        }
        System.out.println(Arrays.toString(montableau));
    }
}
