import javax.management.Notification;

public class Main {
    public static void main(String[] args) {


        try {
            Thread notiThread = new Thread(new notification(), "Noti Daemon Thread");
            notiThread.setDaemon(true); // 이걸해야 데몬스레드 주금
            notiThread.start();
            System.out.println("Current thread: "+ Thread.currentThread().getName());
            System.out.println("Daemon? " + notiThread.isDaemon());
            Thread.currentThread().getThreadGroup().list();
            Thread.sleep(10 * 1000);
            System.out.println("main thread end!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}