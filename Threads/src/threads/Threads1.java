
package threads;

public class Threads1 {

    public static void main(String[] args) throws InterruptedException {
        int x = 0;
       while (x != -1){
           System.out.println("Hi" + x);
           Thread.sleep(x);
           x++;
       }
    }
    
}
