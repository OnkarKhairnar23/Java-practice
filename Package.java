import Package1.*;
import Package2.*;

public class Package{
    public static void main(String args[]){
        int a = 10;
        int b = 20;

        Calc obj1 = new Calc();
        int res = obj1.add(a,b);
        int res2 = obj1.subtract(a,b);
        System.out.println("Result of addition: " + res);
        System.out.println("Result of subtraction: " + res2);
        
        Calc1 obj2 = new Calc1();
        int r3 = obj2.multiply(a,b);
        int r4 = obj2.divide(a,b);
        System.out.println("Result of multiplication: " + r3);
        System.out.println("Result of division: " + r4);
    }
    
}
