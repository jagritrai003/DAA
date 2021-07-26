package week1;

import java.util.Scanner;

public class linearSearch {
  
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
        System.out.println("Present: "+comparison);
        break;
      }
      comparison++;
    }
    if(comparison==arr.length){
      System.out.println("Not Present");
    }
    
    t--;
    
  }

}
  
}
