public class ThreadExample {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);

        t1.run();
        t2.run();
    }
}
