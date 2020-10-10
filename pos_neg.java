import java.util.*;
class pos_neg
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int positive=0,negative=0,zero=0,i,n;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]>0)
            {
                positive++;
            }
            else if(a[i]<0)
            {
                negative++;
            }
            else 
            {
                zero++;
            }
        }
        System.out.println("The number of positive elements= "+positive+"\nThe number of negative elements = "+negative+"\nThe number of zeros is = "+zero);
    }
}