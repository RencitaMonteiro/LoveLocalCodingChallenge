// Given a string s consisting of words and spaces, return the length of the last word in the string.
// LOGIC : 1. The user input is taken and then split into a array 
// The last position value is retrived and then .length() to retrieve its length
import java.util.Scanner;

public class LastWord {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //Create object to input data 
        System.out.println("Enter the String"); 
        String str = sc.nextLine(); //input the string 
        String[] strArray = str.split("\\s"); //Create array of words 
        int length = strArray[strArray.length-1].length(); // retrive the word in last position and its length by .length() function
   
        System.out.print("\nLength of last word '"+ strArray[strArray.length-1] + "is"+ length); //print the word  length
     }
}
