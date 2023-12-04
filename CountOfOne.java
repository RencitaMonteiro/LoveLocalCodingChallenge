//Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n
// LOGIC
// each vakue from 0 to the limit is traversed and check if the number contain 1 . if yes then count is increemented and  at the end at the value is retrived 


import java.util.Scanner;

public class CountOfOne {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i,temp=0,c=0,j=0;
        System.out.println("Enter the limit");
        int n = sc.nextInt();
        for(i=0;i<=n;i++)
        {
          j = i;
          while(j>0)
          {
            temp = j%10;
            if(temp==1)
               c++;
               
            j = j/10;
          }
        }
        System.out.println(c);
    }
}
