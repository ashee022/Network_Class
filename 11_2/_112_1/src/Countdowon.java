public class Countdowon implements Runnable {
    public void run() {
        for (int i = 10; i > -1; i--) {
            Thread currentThread = Thread.currentThread();
            System.out.println("Thread name" + currentThread.getName());
            System.out.println("ThreadGrop" + currentThread.getThreadGroup());
            System.out.println(i);
            System.out.println();
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
