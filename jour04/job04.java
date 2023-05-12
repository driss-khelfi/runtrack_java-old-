import java.util.Scanner;

public class job04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre maximum à compter : ");
        int max = scanner.nextInt();

        long startTime = System.currentTimeMillis();

        int count = 0;
        for (int i = 1; i <= max; i++) {
            count += i;
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Compte total : " + count);
        System.out.println("Temps d'exécution : " + duration + " ms");
    }
}
