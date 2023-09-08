//Write a java program to check whether a number is palindrome or not.
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        int r,sum=0;
        int temp=n;
        
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.print("the number is a palindrome number.");
        }
        else{
            System.out.println("the number is not a palindrome number.");
        }
    }
}