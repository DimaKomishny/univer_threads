public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        });
        thread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("Main: " + i);
        }
    }
}
