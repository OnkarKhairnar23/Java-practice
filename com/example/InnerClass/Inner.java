package com.example.InnerClass;


class Outer {
    public String message = "Hello from the Outer class!";
    class Inner {
        void display() {
            System.out.println("Inner Class");
        }
    }
}

class A{
    void display(){
        System.out.println("in Class A");
    }
}
public class Inner {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        //inner.display();

        A obj = new A(){
            void display(){
                System.out.println("in Anonymous Inner class");
            }
        };
        //obj.display();


    }
}

