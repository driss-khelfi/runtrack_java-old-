import java.util.Scanner;
public class job09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test;
        int myNumero = 1234;
        test = String.valueOf(myNumero);

        char result = test.charAt(0);
        int count = test.length();

        System.out.println("Le premier chiffre de 1234 est: " +result);
        System.out.println("Le dernier chiffre de 1234 est: " +count);
    }
}