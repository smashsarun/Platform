
package Platform2;

public class FloatingPoint {
    public static void main(String[] args) {
        
//        Floating Point Precision:
// 1. Declare myFloat as float.
// 2. Assign 1.23456789f to myFloat.
// 3. What is the value of myFloat stored?
// 4. Reassign 12.23456789f to myFloat.
// 5. What is the value of myFloat now?

        float myFloat = 1.23456789f;
        System.out.println(myFloat);
        myFloat = 12.23456789f;
        System.out.println(myFloat);
        
//        Cancellation Error:
// 1. Evaluate 1 + 1.234e-5f - 1. What is the value?

        float myFloat2 = 1 + 1.234e-5f - 1;
        System.out.println("\n"+myFloat2);
        
//        Float Overflow:
// 1. Declare highFloat as float, assign Float.MAX_VALUE to highFloat.
// 2. Multiply highFloat by 2.
// 3. Is there an exception? What is the value of highFloat now?

        float highFloat = Float.MAX_VALUE;
        highFloat *= 2;
        System.out.println("\n"+highFloat);
        
//        Float Underflow:
// 1. Declare lowFloat as float, assign Float.MIN_VALUE to lowFloat.
// 2. Divide lowFloat by 2.
// 3. Is there an exception? What is the value of lowFloat now?

        float lowFloat = Float.MIN_EXPONENT;
        lowFloat /= 2;
        System.out.println("\n"+lowFloat);
        
//        Infinity/Nan:
// 1. Declare divFloat1 as float, assign 1/0 to divFloat1.
// 2. Declare divFloat2 as float, assign 0/0 to divFloat2.
// 3. Declare sqrtFloat as float, assign Math.sqrt(-1) to sqrtFloat.
// 4. What are the value of divFloat1, divFloat2, and sqrtFloat?
// 5. Use "if (divFloat1 != divFloat1)" or "if Float.isNaN(divFloat1)" to detect whether divFloat1 is NaN. Try it on other variables as well.
    
        float divFloat1 = (float)1/0;
        float divFloat2 = (float)0/0;
        float sqrtFloat = (float) Math.sqrt(-1);
        System.out.println("\n"+divFloat1+"\n"+divFloat2+"\n"+sqrtFloat);
        System.out.println((divFloat1 != divFloat1)+"\t"+Float.isNaN(divFloat1));
        System.out.println((divFloat2 != divFloat2)+"\t"+Float.isNaN(divFloat2));
        System.out.println((sqrtFloat != sqrtFloat)+"\t"+Float.isNaN(sqrtFloat));

    }
}
