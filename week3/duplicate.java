package DAA.week3;

import java.util.Scanner;

public class duplicate {

  void check(int arr[])
  {
    int flag=0;
    if(true){
    int i=0;
    while(i<arr.length)
    {
      int minIndex=i;
      for(int j=i+1;j<arr.length;j++)
      {
        
        if(arr[j]<arr[minIndex])
        {
          minIndex=j;
          break;
        }
      }
      if(minIndex!=i)
      {
        int temp=arr[minIndex];
        arr[minIndex]=arr[i];
        arr[i]=temp;
      }
      i++;
    }
    for(int p=0;p<arr.length-1;p++)
    {
      if(arr[p+1]==arr[p])
      {
        flag++;
        break;
      }
    }
    if(flag==1)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
  }   
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
    duplicate ob=new duplicate();
    
    System.out.print("Enter length of an array: ");
    int n=sc.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    ob.check(arr);
    t--;
  }
  }
  
}
