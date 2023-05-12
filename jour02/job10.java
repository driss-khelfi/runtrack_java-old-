import java.util.Scanner;

public class job10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumero = 1234;
        String s = String.valueOf(myNumero);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int digit = Character.getNumericValue(c);
            sum += digit;
        }
        System.out.println("La somme des chiffres de " + myNumero + " est : " + sum);
    }
}
