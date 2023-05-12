import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Job14 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int number1;
        int number2;

        System.out.println("Entrez votre nombre: ");
        number1 = myObj.nextInt();
        System.out.println("Entrez votre deuxième nombre: ");
        number2 = myObj.nextInt();

        System.out.println(number1 + number2);
    }
}