//Write a java program to enter a number and print its reverse.
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        int d=0;
        System.out.println("the reverse of the number is:");
        while(n>0){
            d=n%10;
            System.out.print(d);
            n=n/10;
        }
    }
}