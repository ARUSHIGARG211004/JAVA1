//charAt
import java.util.*;
public class charAt{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String k=sc.nextLine();
        for(int i=0;i<k.length();i++){
            System.out.println(k.charAt(i));
        }
    }
}