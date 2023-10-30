public class AbbC{
    int a=5;
    final int b;
    AbbC(){
        b=10;
        System.out.println(b);
    }

    public static void main(String[] args) {
        AbbC a= new AbbC();
    }

}

//output= 10
