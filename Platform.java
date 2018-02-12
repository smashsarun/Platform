
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
        
        //แก้ให้ไม่ Infinite loop
        //byte count = (byte)0;
        //byte byteI = (byte)149;
        //for(byte i = 1; count != byteI;){   
        //    count = (byte)((byte)count+i);
        //    System.out.println(count);
        // }
        
        for (byte i = 0; i <= 149; i++) { //เป็น Infinit loop 
            System.out.println(i);
        }
    }
    
}
