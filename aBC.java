public class aBC{
    int a=5;
    final void get(){
        System.out.println(a);
    }
}

public class XYZ extends aBC{
    void get1(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        XYZ x= new XYZ();
        x.get1();
    }

}
//output = hello
