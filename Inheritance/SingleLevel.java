package Inheritance;

// 06:10:51 Need of Inheritance
// 06:17:06 What is Inheritance
// 06:25:50 Single and Multilevel inheritance - syntax and example
// 06:29:41 Multiple Inheritance - not supported in java
// 06:36:16 Method Overriding - runtime polymorphism
// 06:44:05 packages - access modifiers and import statement
// 06:56:20 Access Modifiers - public, private, protected, default
// public - accessible from anywhere
// private - accessible only within the class
// protected - accessible within the package and subclasses
// default - accessible within the package
// 07:04:42 Polymorphism - compile time and runtime
// 07:08:31 Dynamic Method Dispatch - runtime polymorphism
// 07:16:29 Final keyword - variable, method, class

class A{
    final int x = 10;
    public void show(){
        System.out.println("In A show");
    }

}

final class B extends A{
    int y=11;
    public void show(){
        System.out.println("In B show");
    }
}

public class SingleLevel {
    public static void main(String[] args) {
        
        // Object of class B  
        B obj = new B();

        // method overiding - 06:36:16
        obj.show();

        // 

    }

}