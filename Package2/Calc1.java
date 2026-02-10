package Package2;

public class Calc1 {
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero");
            return 0; // Return a default value or handle as needed
        }
    }
    public void show() {
        System.out.println("In Show of Calc1");
    }
}
