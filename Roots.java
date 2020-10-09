import java.util.*;
class Roots
{
  public static void main(String[] args){

  int a,b,c,f=0;
  double D;
  Scanner sc=new Scanner(System.in);
  System.out.println("\nEnter the values of a,b,c:");
  a=sc.nextInt();
  b=sc.nextInt();
  c=sc.nextInt();
  D=(b*b)-(4*a*c);
  if(D==0)
 {
  System.out.println("Roots are real and equal");
  f=1;
 }
 else if(D>0)
 {
  System.out.println("Roots are real and unequal");
  f=1;
 }
 else if(D<0)
 {
  System.out.println("Roots are imaginary");
 }
if(f==1)
{ 
  double r1=((-b+Math.sqrt(D))/(2*a));
  double r2=((-b-Math.sqrt(D))/(2*a));
  System.out.println("Roots are:"+r1+","+r2);
}
}
}
