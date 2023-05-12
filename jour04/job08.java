public class job08 extends Thread {
    private final int start;
    private final int end;
    private long sum;

    public job08(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public long getSum() {
        return sum;
    }

    @Override
    public void run() {
        sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }
}



