import java.io.*;
import java.util.*;

public class job03 {
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
                char c = (char) (rnd.nextInt(26) + 'a'); // Générer un caractère aléatoire entre 'a' et 'z'
                sb.append(c); // Ajouter le caractère au StringBuilder
            }
            String randomString = sb.toString(); // Convertir le StringBuilder en chaîne de caractères

            int midPoint = length / 2; // Trouver le point médian de la chaîne de caractères
            String firstHalf = randomString.substring(0, midPoint); // Extraire la première moitié de la chaîne de caractères
            String secondHalf = randomString.substring(midPoint); // Extraire la deuxième moitié de la chaîne de caractères

            Thread t1 = new Thread(new WriteToFileRunnable(firstHalf, writer, 0)); // Créer un thread pour écrire la première moitié
            Thread t2 = new Thread(new WriteToFileRunnable(secondHalf, writer, midPoint)); // Créer un thread pour écrire la deuxième moitié
            t1.start(); // Démarrer le premier thread
            t2.start(); // Démarrer le deuxième thread
            t1.join(); // Attendre la fin de l'exécution du premier thread
            t2.join(); // Attendre la fin de l'exécution du deuxième thread

            writer.close(); // Fermer l'objet FileWriter

            long endTime = System.nanoTime(); // Mesurer le temps de fin de l'exécution du programme
            long duration = (endTime - startTime) / 1000000; // Calculer la durée d'exécution en millisecondes
            System.out.println("Le programme s'est exécuté en " + duration + " ms.");
        } catch (IOException | InterruptedException e) {
            System.out.println("Une erreur est survenue : " + e.getMessage());
        }
    }

    static class WriteToFileRunnable implements Runnable {
        private final String str;
        private final FileWriter writer;
        private final int offset;

        public WriteToFileRunnable(String str, FileWriter writer, int offset) {
            this.str = str;
            this.writer = writer;
            this.offset = offset;
        }

        @Override
        public void run() {
            try {
                writer.write(str, offset, str.length()); // Écrire la chaîne de caractères dans le fichier en utilisant l'offset pour déterminer où commencer l'écriture
            } catch (IOException e) {
                System.out.println("Une erreur est survenue lors de l'écriture dans le fichier : " + e.getMessage());
            }
        }
    }
}
