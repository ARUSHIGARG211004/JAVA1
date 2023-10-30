public class ABC{
    int a=5;
    final void get(){
        System.out.println(a);
    }
}

public class XYZ extends ABC{
    void get1(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        XYZ x= new XYZ();
        x.get();
    }

}

//output = 5
