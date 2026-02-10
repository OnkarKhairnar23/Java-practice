import Package1.*;

public class Package{
    public static void main(String args[]){
        int a = 10;
        int b = 20;

        Calc obj1 = new Calc();
        int res = obj1.add(a,b);
        int res2 = obj1.subtract(a,b);
        obj1.show();
        System.out.println("Result of addition: " + res);
        System.out.println("Result of subtraction: " + res2);
        
        AdvCalc obj2 = new AdvCalc();
        int r3 = obj2.multiply(a,b);
        int r4 = obj2.divide(a,b);
        obj2.show();
        System.out.println("Result of multiplication: " + r3);
        System.out.println("Result of division: " + r4);

        VeryAdvCalc obj3 = new VeryAdvCalc();
        int r5 = obj3.power(a,b);   
        obj3.show();
        System.out.println("Result of power: " + r5);
    }
    
}
