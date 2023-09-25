//write a java program to find the total number of alphabets,digits or special character in a string.
import java.util.*;

public class find {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String n = scanner.nextLine();
        

        int alphabet = 0;
        int digit = 0;
        int special = 0;

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                alphabet++;
            } else if (ch >= '0' && ch <= '9') {
                digit++;
            } else {
                special++;
            }
        }

        System.out.println("Alphabets: " + alphabet);
        System.out.println("Digits: " + digit);
        System.out.println("Special Characters: " + special);
    }
}
