import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class job05 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int age;
        System.out.println("Entrez votre âge:");
        age = myObj.nextInt();


        if (age < 18) {
            System.out.println("Vous êtes trop jeune pour travailler");

        }
        if (age > 55) {
            System.out.println("Vous aurez du mal à trouver un emploi ");

        }
        if (age > 67) {
            System.out.println("Vous êtes à la retraite ");

        }
        else if (age > 18 && age < 67) {
            System.out.println("Vous avez l'âge légal pour travailler ");

        }
    }
}


