public class MultiThreadingExample {
    public static void main(String[] args) {
        // Create and start the first thread
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        thread1.start();

        // Create and start the second thread
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));
        thread2.start();
    }
}

class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + ": Count " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.err.println(name + " was interrupted.");
            }
        }
        System.out.println(name + " has completed.");
    }
}
