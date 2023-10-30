public class ABc{
    int a=5;
     void get(){
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

//output= hello
