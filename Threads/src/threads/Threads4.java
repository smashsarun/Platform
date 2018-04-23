package threads;

import java.util.Scanner;

public class Threads4 {

    private static class MessageLoop implements Runnable {

        public void run() {

            try {
                for (int i = 0; i > -1; i++) {
                    System.out.println(i + " :Enter something to stop");
                    Thread.sleep(1000);
                }

            } catch (InterruptedException ex) {
                
            }

        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            Thread th = new Thread(new MessageLoop());

            th.start();

            String something = input.next();
            th.interrupt();
        }
    }
}
