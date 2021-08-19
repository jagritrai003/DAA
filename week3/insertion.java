package DAA.week3;

import java.util.Scanner;

public class insertion {

  void sort(int arr[],int q,int shift,int compar)
  {
    if(true){
    for(int i=1;i<arr.length;i++)
    {
      int key=arr[i];
      int j;
      for(j=i-1;j>=0&&arr[j]>key;j--,compar++)
        {
          arr[j+1]=arr[j];
          shift++;
        }
        arr[j+1]=key;
        shift++;
      }
    }
    print(arr);
    System.out.println();
    System.out.println("shift="+shift);
    System.out.print("comparision="+compar);
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

    int shift=0,compar=0;
    insertion ob=new insertion();
    System.out.print("Enter length of an array: ");
    int n=sc.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    System.out.println("Press 1 to sort elements:");
    int q=sc.nextInt();
    ob.sort(arr,q,shift,compar);
    t--;

  }
  }
  
}
