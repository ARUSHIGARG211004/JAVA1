import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String k=sc.next();
        String n="";
        for(int i=0;i<k.length();i++){
            char ch=k.charAt(i);
            n=ch+n;
        }
        System.out.println("the reversed String is: "+n);
    }
}
