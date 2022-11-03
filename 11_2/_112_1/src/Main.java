public class Main {
    public static void main(String[] args) {

       ThreadGroup timer = new ThreadGroup("Timer");
       System.out.println(timer.getMaxPriority());
       ThreadGroup suwon = new ThreadGroup(timer, "Suwon timer");
       suwon.setMaxPriority(1); // 이걸 줬는데도 별순서 차이가 없음 >> 이게 정상임
       ThreadGroup jeju = new ThreadGroup(timer, "jeju timer");
       jeju.setMaxPriority(10);
       Thread suwonCountdown = new Thread(suwon, new Countdowon(), "Suwon Countdown");
       Thread jejuonCountdown = new Thread(jeju, new Countdowon(), "jeju Countdown");
       suwonCountdown.start();
       try {
          suwonCountdown.join(); // 조인쓰면 순서를 정해놀 수 있음. 다음 으로 오게함.
       } catch (InterruptedException e) {
          throw new RuntimeException(e);
       }
       jejuonCountdown.start();
    }
}