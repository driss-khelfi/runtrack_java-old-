import java.util.Scanner;

public class job07 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int y = myObj.nextInt();

        int resultat = 1;
        for (int i = 1; i <= y; i++) {
            resultat *= i;
        }

        System.out.println("La factorielle de " + y + " est : " + resultat);
    }
}
