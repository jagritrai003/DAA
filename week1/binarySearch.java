package week1;

import java.util.*;

public class binarySearch {

  void searchMiddle(int arr[], int k,int comp ,int startIndex, int endIndex)
  {
  
   int mid=(startIndex+endIndex)/2;
   comp++;
   if(arr.length==0||startIndex>endIndex)
   {
    System.out.print("Not Present");
   }
   else if(k==arr[mid])
   {
     comp++;
     int s=mid+1;
     System.out.print("Present at: "+ s +" comparision: "+comp);
   }
   else if(k>arr[mid])
   {
      searchMiddle(arr,k,comp,mid+1,endIndex);
   }
   else if(k<arr[mid])
   {
     searchMiddle(arr,k,comp,startIndex,mid-1);
   }
  }

  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the no.of test case: ");
      int t=sc.nextInt();
      while(t!=0)
      {
        binarySearch ob=new binarySearch();
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key value: ");
        int temp=sc.nextInt();
        ob.searchMiddle(arr,temp,0,0,n-1);
        t--;
        System.out.println();
      }
  }
}
