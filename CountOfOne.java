//Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n
// LOGIC
// each vakue from 0 to the limit is traversed and check if the number contain 1 . if yes then count is increemented and  at the end at the value is retrived 


import java.util.Scanner;

public class CountOfOne {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); //Create oject to input data 
        int i,temp=0,c=0,j=0; //Initialization 
        System.out.println("Enter the limit");
        int n = sc.nextInt(); // Input the data 
        for(i=0;i<=n;i++) //traverve from 0 to the limit
        {
          j = i;  
          while(j>0)
          {
            temp = j%10; // retrieve the last digit 
            if(temp==1) // check if its equal to 1 
               c++; // if its 1 , increement counter 
               
            j = j/10; //discard the lst digit , in order to check for preceeding numbers 
          }
        }
        System.out.println(c); //  Print the number of 1's 
    }
}
