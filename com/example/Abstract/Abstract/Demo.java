package com.example.Abstract;

abstract class Car{
    final int wheels = 0;
    final String color = "";
    final int price = 0;
    abstract void drive();
    abstract void display();

}

class Audi extends Car{
    int wheels = 3;
    String color = "Black";
    int price = 100000;
    void drive(){
        System.out.println("Driving Audi");
    }
    void display(){
        System.out.println("Wheels: " + wheels);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }
}

class Demo{
    public static void main(String arg[]){
        Car c = new Car(){
            void drive(){
                System.out.println("Driving Anonymous Car");
            }
            void display(){
                System.out.println("Displaying Anonymous Car");
            }
        };
        c.drive();
        c.display();
    }
}