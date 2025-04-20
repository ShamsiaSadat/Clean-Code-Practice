package chapter_13_Concurrency;

public class BadCounter {
    private int count = 0;

    public void increment() {
        count++; // Not thread-safe!
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        BadCounter counter = new BadCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count (bad): " + counter.getCount());
    }
}
