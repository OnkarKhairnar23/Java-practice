package Inheritance;

// Multiple-Level Inheritence 
class A{
    public void show(){
        System.out.println("In A show");
    }

}

class B{
    public void show1(){
        System.out.println("In B show");
    }
}

class C{
    public void show2(){
        System.out.println("In C show");
    }
}
public class MultipleLevel {
    public static void main(String[] args) {
        C obj = new C();
        obj.show2();
    }
}
