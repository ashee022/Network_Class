public class notification implements Runnable{
    public void run() {

        while (true) {
            int message = (int) (Math.random() * 10) + 1; // 가짜메시지 ㅋㅋ; 여기에 메세지 쓰기
            try {
                System.out.println("Message count :" + message);
                Thread.sleep(1000 * 2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
