import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class job03 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int number;


        System.out.println("Entrez votre nombre: ");
        number = myObj.nextInt();
        int number2 = 0;
        int produit = number*number2;
        while (number2 <=10) {
            System.out.println(number + " x " +  number2 + " = " + (number*number2));
            number2 ++;
        }
    }
}