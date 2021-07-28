package week1;

import java.util.Scanner;

public class exponentialSearch {

  int elementSearch(int arr[],int k)
  {
    int i=1,comparison=1;
    if(arr[0]==k)
    {
       return comparison;
    }
    while(i<arr.length&&arr[i]<=k)
    {
      
      i=i*2;
    }
    for(int j=i/2;arr[j]<=k;j++)
    {
      comparison++;
      if(arr[j]==k)
      {
        return comparison;
      }
    }
    return 0;

  }

  public static void main(String[] args)
  {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the no. of test cases: ");
  int t=sc.nextInt();
  while(t!=0)
  {
    exponentialSearch ob=new exponentialSearch();
    System.out.print("Enter the size of array: ");
    int n=sc.nextInt();
    int []arr=new int[n];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the key value: ");
    int temp=sc.nextInt();
    int s=ob.elementSearch(arr, temp);
        if(s!=0)
        {
          System.out.println("Present "+s);
        }
        else{
          System.out.println("Not Present");
        }
    t--;
    System.out.println();
    
  }
  
}
}
