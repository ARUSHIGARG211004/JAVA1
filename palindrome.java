//Write a java program to check whether a number is palindrome or not.
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a String:");
        String n=sc.next();
        String reverse="";
        int length= n.length();
        for(int i=length-1;i>=0;i--){
            reverse=reverse+n.charAt(i);
        }
        if(n.equals(reverse)){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("IT is not a palindrome");
        }
    }
}
g 