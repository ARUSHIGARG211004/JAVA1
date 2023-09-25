//write a java program to find the total number of alphabets,digits or special character in a string.
import java.util.*;

//find the total number of vowels and consonent in a string.
public class vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String n = scanner.nextLine();
        

        int vowels = 0;
        int consonent = 0;
        

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if ((ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch=='U' || ch=='a'||ch=='e'|| ch=='i'||ch=='o'||ch=='u')){
                vowels++;
            } 
             else {
                consonent++;
            }
        }

        System.out.println("vowels: " + vowels);
        System.out.println("consonent: " + consonent);
        
    }
}

