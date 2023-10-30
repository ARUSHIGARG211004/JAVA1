public class A{
    void get(){
        System.out.println("MeThOd Is CaLlInG");
    }
}

public class B extends A{
    void display(){
        System.out.println("HeLlO");

    }

}

public class C{
    public static void main(String[]args){
        A a=new A();
        a.get();
        B b =new B();
        b.get();
        b.display();
    }
}
