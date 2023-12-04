//Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
//LOGIC:
// The  array is sorted and then the count of each number is evaluated. the count value is compared with n/3 and displayed if its equal or greater
// The condition is again checked to ensure the number at the end of array is also checked 


import java.util.Scanner;
import java.util.Arrays;
public class array {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int  min= n/3; //initialize the minimum count
        int[] arr = new int[n]; //create a array
        System.out.println("Enter the array values");
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();//input the value
            
        Arrays.sort(arr); //sort the array
        int j=0;
        int count=1;
        while(j<n-1)  for all content in array 
        {

            if(arr[j]==arr[j+1]) //check if the value in current position is equal to value in next position
            {
               count++; // if thy r equal increement the counter
            }
            else
            {
               if(count>=min) //print the value if it is greate than minimum requirement(n/3)
                  System.out.println("The value repeating more than n/3 number of time is " + arr[j]);
               count=1; // Re-iniliaze the counter
            }
            j++;

            
        }
        if(count>=min) // to print if the value in the last position is greater than minimum
                  System.out.println("The value repeating more than n/3 number of time is " + arr[n-1]);          
       
    }
}
