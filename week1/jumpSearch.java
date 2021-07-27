package week1;

import java.util.Scanner;

public class jumpSearch {

  int searchElement(int arr[],int k)
  {
    int comparision=0;
    int jump=(int)Math.floor(Math.sqrt(arr.length));
    int prev=0;
    
    while(arr[prev]<=k&&jump<arr.length)
    {
       comparision++;
       if(k==arr[prev])
       {  
         return comparision;
       }
       else
       {
         prev=jump;
         jump=jump+jump;
       }
    }
    for(int i=prev;arr[i]<=k;i++)
    {
      comparision++;
      if(arr[i]==k)
      {
        return comparision;
      }
    }
    return 0;
  }

  public static void main(String[] args)
  {

      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the no.of test case: ");
      int t=sc.nextInt();
      while(t!=0)
      {
        jumpSearch ob=new jumpSearch();
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key value: ");
        int temp=sc.nextInt();
        int s=ob.searchElement(arr, temp);
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
