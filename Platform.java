
package platform;

public class Platform {

    public static void main(String[] args) {
        //1.
        System.out.println("Min value of Byte is "+Byte.MIN_VALUE+
                "\nMax value of Byte is "+Byte.MAX_VALUE);
        //2.
        byte A = Byte.MAX_VALUE;
        byte B = Byte.MIN_VALUE;
        byte newA = (byte) (A+1);
        byte newB = (byte) (B-1);

        System.out.println("New value of A "+ newA +", New value of B "+ newB);
        
        //3.
        for(byte i = 0; i <= 149; i++){
            System.out.println(i);
        }
    }
    
}
