public class tread extends Thread {

    public tread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 10; i > -1; i--) {
            System.out.println(getName() + ": " + i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
