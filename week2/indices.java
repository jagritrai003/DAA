package week2;

import java.util.Scanner;

public class indices {

  int searchelement(int arr[],int k,int low,int high)
  {
    if(low<=high)
  {
    int mid=low+(high-low)/2;
    if(k==arr[mid])
   {
     return mid;
   }
   else if(arr[mid]<k)
   {
      return searchelement(arr, k, mid+1, high);
   }
   else if(arr[mid]>k)
   {
      return searchelement(arr,k,low,mid-1);
   }
  }
   return -1;
  }

  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the no.of test case: ");
      int t=sc.nextInt();
      while(t!=0)
      {
        indices ob=new indices();
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
          for(int j=i+1;j<arr.length;j++)
          {
            int s=arr[i]+arr[j];
            int p=ob.searchelement(arr,s,0,arr.length-1);
            if(p==-1)
            {
              continue;
            }
            else 
            {
              c++;
              System.out.println("Sequence Found: "+(i+1)+" "+(j+1)+" "+(p+1));
            }
          }
        }
        if(c!=1)
        {
          System.out.println("No Sequence Found!!!");
        }
        t--;
        System.out.println();
      }
  }
  
}
