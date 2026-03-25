package com.example.Interface;

interface Computer{
    void code();
}

class Lap implements Computer
{
    public void code(){
        System.out.println("Coding in Lap");
    }
}

class Desktop implements Computer
{
    public void code(){
        System.out.println("Coding in Desktop");
    }
}

class Developer{
    public void coding(Computer comp){
        comp.code();
    }
}

public class Radha {
    public static void main(String args[]){
        Developer onkar = new Developer();
        Lap lenevoLap = new Lap();
        Desktop dellDesktop = new Desktop();
        onkar.coding(lenevoLap);
        onkar.coding(dellDesktop);
    }
}
