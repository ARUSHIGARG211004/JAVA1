//Write a java program to swap the  first and last digit of a number.
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n number:"+" ");
        int n=sc.nextInt();
        int sum=0;
        int d=n%10;
        while(n>=10)
            n=n/10;
        
        System.out.println("the first and last digit of the number before swapping is:"+n+"and "+d); 
        int temp=d;
        d=n;
        n=temp;
        System.out.println("the first and last digit of the number after swapping is:"+n+"and" +d);
        
        
        
    }
}