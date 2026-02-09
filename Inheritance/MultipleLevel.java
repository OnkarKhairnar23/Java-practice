package Inheritance;

// Multiple-Level Inheritence 
class A{
    public void show(){
        System.out.println("In A show");
    }

}

class B extends A{     // Use of extends keyword to inherit class A
    public void show(){     // method overriding - 06:36:16
        System.out.println("In B show");
    }
}

class C extends B{     // Use of extends keyword to inherit class B
    public void show2(){    
        System.out.println("In C show");
    }
}
public class MultipleLevel {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();     
        //obj.show1();
        obj.show2();

    }
}
