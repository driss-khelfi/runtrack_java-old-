import java.util.Scanner;

public class job05 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre maximum à compter : ");
        int max = scanner.nextInt();

        long startTime = System.currentTimeMillis();

        CounterThread thread1 = new CounterThread(1, max/2);
        CounterThread thread2 = new CounterThread(max/2 + 1, max);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        int count = thread1.getCount() + thread2.getCount();

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Compte total : " + count);
        System.out.println("Temps d'exécution : " + duration + " ms");
    }
}

class CounterThread extends Thread {
    private int start;
    private int end;
    private int count;

    public CounterThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.count = 0;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            count += i;
        }
    }

    public int getCount() {
        return count;
    }
}
