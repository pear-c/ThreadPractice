public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName() + " 실행 중: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
