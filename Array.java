import java.util.Scanner;
class Array
{
 public static void main(String args[])
 {
  int i,j,k,sum,n,max,min;
  sum=0;
  double avg;
  j=k=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter array size:");
  n=sc.nextInt();
  int A[]=new int[n];
  int B[]=new int[10];
  int C[]=new int[10];
  System.out.println("Enter array elements of A");
  for(i=0;i<n;i++)
  {
   System.out.print("Enter element"+(i+1)+":");
   A[i]=sc.nextInt();
  }
  System.out.println("\nDisplaying Array A");
  for(i=0;i<n;i++)
  {
   System.out.print(A[i]+"\t");
   if(A[i]%2==0)
   {
    B[j]=A[i];
    j++;
   }
   else if(A[i]%2!=0)
   {
    C[k]=A[i];
    k++;
   }
  }
  System.out.println("\nDisplaying Array B");
  for(i=0;i<j;i++)
  {
   System.out.print(B[i]+"\t");
  }
  System.out.println("\nDisplaying Array C");
  for(i=0;i<k;i++)
  {
   System.out.print(C[i]+"\t");
  }
  max=C[0];
  min=C[0];
  for(i=0;i<k;i++)
  {
   sum=sum+C[i];
   if(max<C[i])
   max=C[i];
   if(min>C[i])
   min=C[i];
  }
  avg=sum/k;
   System.out.println("\nSum of Array C: "+sum);
   System.out.println("Max of Array C: "+max);
   System.out.println("Min of Array C: "+min);
   System.out.println("Average of Array C: "+avg);
 }
}