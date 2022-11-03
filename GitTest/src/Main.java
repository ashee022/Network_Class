public class Main {
    public static void main(String[] args) {
        Thread a1 = new Thread(new CountDown());
        Thread a2 = new Thread(new CountDown());
        Thread a3 = new Thread(new CountDown());
        //Thread a1 = new Thread(new CountDown(), "a1");
        //Thread a2 = new Thread(new CountDown(), "a2");
        //Thread a3 = new Thread(new CountDown(), "a3");
       // tread a2 = new tread("a2");
       // tread a3 = new tread("a3");

        a1.start();
        a2.start();
        a3.start();
    }

}