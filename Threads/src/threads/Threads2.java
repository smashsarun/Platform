
package threads;

public class Threads2 {
    public static void main(String[] args) throws InterruptedException {
        String message[] = {"A","B","C","D"};
        
        for (int i = 0; i < message.length; i++) {
            Thread.sleep(4000);
            System.out.println(message[i]);
        }
    }
}
