import java.util.*;
class market
{
    static double total_bill(double rate[],int quant[],int x)
    {
        double total=0;
        for(int i=0;i<x;i++)
        {
            total=total+(rate[i]*quant[i]);
        }
        return total;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,x;
        double bill,discount=0.0,discounted_bill=0.0;
        System.out.println("Enter the number of items");
        x=sc.nextInt();
        double rate[]=new double[x];
        int quantity[]=new int[x];
        System.out.println("Enter the rate of each of the items");
        for(i=0;i<x;i++)
        {
            rate[i]=sc.nextDouble();
        }
        for(i=0;i<x;i++)
        {
            System.out.println("Enter the quantity of item number:"+(i+1)+" purchased by the customer:");
            quantity[i]=sc.nextInt();
        }
        bill=total_bill(rate,quantity,x);
        if(bill>=10000)
        {
            discount=(0.05*bill);
        }
        else if(bill>=7500 && bill<10000)
        {
            discount=(0.03*bill);
        }
        else if(bill>=5000 && bill<7500)
        {
            discount=(0.02*bill);
        }
        discounted_bill=bill-discount;
        System.out.println("The final bill amount of the customer is:Rs."+discounted_bill);
        }
}