import java.util.*;
class Indices
{
  public static void main(String[] args)
{ 
  int n,i,sum_even=0,sum_odd=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the size of the array");
  n=sc.nextInt();
  int arr[]=new int[n];
  System.out.println("Enter the elements of the array");
  for(i=0;i<n;i++)
  {
    arr[i]=sc.nextInt();
  }
  for(i=0;i<n;i++)
  {
    if(i%2==0)
    {
     sum_even=sum_even+arr[i];
    }
    else if(i%2==1)
    {
     sum_odd=sum_odd+arr[i];
    }
  }
  System.out.println("The sum of even index numbers is:"+sum_even);
  System.out.println("The sum of odd index numbers is:"+sum_odd);
}
}