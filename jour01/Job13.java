import java.util.Scanner;

public class Job13 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int number;

        System.out.println("Entrez votre nombre: ");
        number = myObj.nextInt();

        while (number > 0) {
            System.out.println(number);
            number--;
        }
    }
}
