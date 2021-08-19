package DAA.week3;

import java.util.Scanner;

public class selection {

  void sort(int arr[],int q)
  {
    int compar=0,swap=0;
    if(true){
    int i=0;
    while(i<arr.length)
    {
      int minIndex=i;
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[j]<arr[minIndex])
        {
          compar++;
          minIndex=j;
          break;
        }
      }
      if(minIndex!=i)
      {
        int temp=arr[minIndex];
        arr[minIndex]=arr[i];
        arr[i]=temp;
        swap++;
      }
      i++;
    }
  }
  print(arr);
  System.out.println();
  System.out.println("comparision="+compar);
  System.out.print("swaps="+swap);
      
  }

  void print(int arr[])
  {
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t!=0){
    selection ob=new selection();
    
    System.out.print("Enter length of an array: ");
    int n=sc.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    System.out.println("Press 1 to sort elements:");
    int q=sc.nextInt();
    ob.sort(arr,q);
    t--;
  }
  }
  
  
}
