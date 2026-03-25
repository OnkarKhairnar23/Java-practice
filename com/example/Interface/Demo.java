package com.example.Interface;

// class-class : extends
// interface-interface : extends
// class-interface : implements

interface A{
    void drive();
    void show();
}

interface X{
    void run();
}

class B implements A,X{
    public void drive(){
        System.out.println("In drive of B");
    }
    public void show(){
        System.out.println("In show of B");
    }
    public void run(){
        System.out.println("In run of B");
    }
}

public class Demo {
    public static void main(String arg[]){
        A a = new B();
        a.drive();
        a.show();
        X x = new B();
        x.run();
    }
}
