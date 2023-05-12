public class ThreadProject {
    public static void main(String[] args) throws InterruptedException {
        final int N = 10000; // number of threads
        final int MAX = 10000000; // maximum integer to sum
        final int STEP = MAX / N; // number of integers to sum per thread

        // create threads
        job08[] threads = new job08[N];
        for (int i = 0; i < N; i++) {
            int start = i * STEP + 1;
            int end = (i == N - 1) ? MAX : (i + 1) * STEP;
            threads[i] = new job08(start, end);
        }

        // start threads
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            threads[i].start();
        }

        // wait for threads to finish
        for (int i = 0; i < N; i++) {
            threads[i].join();
        }
        long endTime = System.currentTimeMillis();

        // combine results
        long totalSum = 0;
        for (int i = 0; i < N; i++) {
            totalSum += threads[i].getSum();
        }

        // print result
        System.out.println("Total sum: " + totalSum);
        System.out.println("Time: " + (endTime - startTime) + " ms");
    }
}