package week0;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class linear {

  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no. of test cases: ");
    int t=sc.nextInt();
    while(t!=0)
    {
      System.out.print("Enter the size of array: ");
      int n=sc.nextInt();
      int []arr=new int[n];
      for(int i=0;i<arr.length;i++)
      {
          arr[i]=sc.nextInt();
      }
      System.out.println("Enter the key value: ");
      int temp=sc.nextInt();
      int comparison=0;
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]==temp)
        {
          comparison++;
          System.out.println("No. of comparison is "+comparison);
          break;
        }
        else{
          System.out.println("Not present");
          comparison++;
        }
      }

      t--;
      
    }
  }
  
}