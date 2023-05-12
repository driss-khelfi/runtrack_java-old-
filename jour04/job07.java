import java.util.Scanner;

public class job07 {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir un tableau de nombres
        System.out.print("Entrez la taille du tableau : ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Divise le tableau en deux moitiés
        int mid = size / 2;
        int[] firstHalf = new int[mid];
        int[] secondHalf = new int[size - mid];
        System.arraycopy(array, 0, firstHalf, 0, mid);
        System.arraycopy(array, mid, secondHalf, 0, size - mid);

        // Crée deux threads, chacun chargé de calculer la somme d'une moitié du tableau
        SumThread firstThread = new SumThread(firstHalf);
        SumThread secondThread = new SumThread(secondHalf);

        // Lance les deux threads en parallèle
        long startTime = System.currentTimeMillis();
        firstThread.start();
        secondThread.start();

        // Attend la fin des deux threads
        firstThread.join();
        secondThread.join();
        long endTime = System.currentTimeMillis();

        // Combine les résultats pour obtenir la somme totale
        int totalSum = firstThread.getSum() + secondThread.getSum();

        // Affiche la somme totale ainsi que le temps d'exécution
        System.out.println("La somme totale est : " + totalSum);
        System.out.println("Temps d'exécution : " + (endTime - startTime) + " ms");
    }
}

class SumThread extends Thread {
    private final int[] array;
    private int sum = 0;

    public SumThread(int[] array) {
        this.array = array;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
    }
}
