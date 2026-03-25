package com.example.Enum;

enum Status{
    Running, Failed, Pending, Loading, Success;
}

public class Demo {
    public static void main(String args[]){
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());
        
    }
}
