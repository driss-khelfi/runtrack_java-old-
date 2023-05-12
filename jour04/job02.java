import java.io.*;
import java.util.*;

public class job02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la longueur de la chaîne de caractères aléatoire à générer : ");
        int length = sc.nextInt();
        long startTime = System.nanoTime(); // Mesure le temps de départ de l'exécution du programme

        try {
            FileWriter writer = new FileWriter("output.txt"); // Créer un objet FileWriter pour écrire dans le fichier
            Random rnd = new Random(); // Créer un objet Random pour générer la chaîne de caractères aléatoire

            StringBuilder sb = new StringBuilder(length); // Créer un objet StringBuilder pour stocker la chaîne de caractères
            for (int i = 0; i < length; i++) {
                char c = (char) (rnd.nextInt(10) + 'a'); // Générer un caractère aléatoire entre 'a' et 'z'
                sb.append(c); // Ajouter le caractère au StringBuilder
            }
            String randomString = sb.toString(); // Convertir le StringBuilder en chaîne de caractères

            writer.write(randomString); // Écrire la chaîne de caractères dans le fichier
            writer.close(); // Fermer l'objet FileWriter

            long endTime = System.nanoTime(); // Mesurer le temps de fin de l'exécution du programme
            long duration = (endTime - startTime) / 1000000; // Calculer la durée d'exécution en millisecondes
            System.out.println("Le programme s'est exécuté en " + duration + " ms.");
        } catch (IOException e) {
            System.out.println("Une erreur est survenue : " + e.getMessage());
        }
    }
}
