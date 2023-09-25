import java.util.*;
public class Main{
    public static void toggle(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String:");
        String s=sc.next();
        String k="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65&& s.charAt(i)<=90){
                k=k+(char)(s.charAt(i)+32);
                
            }
            else
            k=k+(char)(s.charAt(i)-32);
        }
        System.out.println(k);
    }
}