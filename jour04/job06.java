import java.util.Scanner;

public class job06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau : ");
        int taille = input.nextInt();

        int[] tableau = new int[taille];

        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < taille; i++) {
            tableau[i] = input.nextInt();
        }

        long debut = System.currentTimeMillis();
        int somme = 0;
        for (int i = 0; i < taille; i++) {
            somme += tableau[i];
        }
        long fin = System.currentTimeMillis();

        System.out.println("La somme des éléments du tableau est : " + somme);
        System.out.println("Le temps d'exécution est : " + (fin - debut) + " millisecondes.");
    }
}
