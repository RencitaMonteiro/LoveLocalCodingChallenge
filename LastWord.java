// Given a string s consisting of words and spaces, return the length of the last word in the string.
// LOGIC : 1. The user input is taken and then split into a array 
// The last position value is retrived and then .length() to retrieve its length
import java.util.Scanner;

public class LastWord {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String[] strArray = str.split("\\s");
        int length = strArray[strArray.length-1].length();
   
        System.out.print("\nLength of last word '"+ strArray[strArray.length-1] + "is"+ length);
     }
}
