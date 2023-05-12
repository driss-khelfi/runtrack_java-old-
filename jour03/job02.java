import java.util.Arrays;
public class job02 {
    public static void main(String[] args) {
        int[] montableau = {12, 6, 76, 89};
        System.out.println(Arrays.toString(montableau));

        int a = 123;
        montableau = Arrays.copyOf(montableau, montableau.length + 1);
        montableau[montableau.length - 1] = a;
        System.out.println(Arrays.toString(montableau));
        int b = 999;
        montableau = Arrays.copyOf(montableau, montableau.length + 1);
        montableau[montableau.length - 1] = b;
        System.out.println(Arrays.toString(montableau));
    }
}