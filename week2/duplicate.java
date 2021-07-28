package week2;

import java.util.Scanner;

public class duplicate {

  int firstHalf(int arr[],int key) {

    int start=0;
    int end=arr.length-1;

    while(start<=end)
    {
        int mid=start+(end-start)/2;

        if(arr[mid]==key)
        {
            if(mid-1>=0 && arr[mid-1]==key)
            {
               end=mid-1;
               continue;
            }
            return mid;
        }

        else if(arr[mid]<key)
            start=mid+1;
        else
            end=mid-1;
    }
    return -1;
}

int secondHalf(int arr[],int key)
{

    int start=0;
    int end=arr.length-1;

    while(start<=end)
    {
        int mid=start+(end-start)/2;

        if(arr[mid]==key) 
        {
            if(mid+1<arr.length && arr[mid+1]==key)
            {
               start=mid+1;
               continue;
            }
            return mid;
        }

        else if(arr[mid]<key)
            start=mid+1;
        else
            end=mid-1;
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
        duplicate ob=new duplicate();
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key value: ");
        int temp=sc.nextInt();
        int first=ob.firstHalf(arr, temp);
        int last=ob.secondHalf(arr, temp);
        System.out.println((last-first)+1);
        t--;
        System.out.println();
      }
  }
  
}
