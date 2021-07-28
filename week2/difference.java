package week2;

import java.util.Scanner;

public class difference {

  int countPair(int arr[],int key,int count)
  {

    for(int i=0;i<arr.length;i++)
        {
          for(int j=i+1;j<arr.length;j++)
          {
            int s=Math.abs(arr[i]-arr[j]);
            
            if(s==key)
            {
              count++;
            }
          }
        }
        return count;
  }

  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the no.of test case: ");
      int t=sc.nextInt();
      while(t!=0)
      {
        difference ob=new difference();
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
        System.out.print("Enter the key: ");
        int key=sc.nextInt();
        System.out.println(ob.countPair(arr, key, 0));
        t--;
        System.out.println();
      }
  }
  
}
