package chapter_13_Concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class GoodCounter {

    private final AtomicInteger count = new AtomicInteger(0); // Thread-safe

    public void increment() {
        count.incrementAndGet(); // Safe atomic operation
    }

    public int getCount() {
        return count.get();
    }

    public static void main(String[] args) throws InterruptedException {
        GoodCounter counter = new GoodCounter();

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

        System.out.println("Final count (good): " + counter.getCount()); // Always 2000
    }
}
