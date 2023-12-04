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
        int  min= n/3;
        int[] arr = new int[n];
        System.out.println("Enter the array values");
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
            
        Arrays.sort(arr);
        int j=0;
        int count=1;
        while(j<n-1)
        {

            if(arr[j]==arr[j+1])
            {
               count++; 
            }
            else
            {
               if(count>=min)
                  System.out.println("The value repeating more than n/3 number of time is " + arr[j]);
               count=1;
            }
            j++;

            
        }
        if(count>=min)
                  System.out.println("The value repeating more than n/3 number of time is " + arr[n-1]);          
       
    }
}
