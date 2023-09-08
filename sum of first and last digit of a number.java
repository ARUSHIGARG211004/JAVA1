//Write a java program to find the sum of the  first and last digit of a number.
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
        sum=d+n;
            
        System.out.println("the sum is of the first and last digit is:"+ sum);
        
        
    }
}