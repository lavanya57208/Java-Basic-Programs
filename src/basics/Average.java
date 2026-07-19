package basics;
import java.util.Scanner;
public class Average
{
    public static void main(String args[])
    {
        Scanner i = new Scanner(System.in);
        int sum=0;
        int a;
        for(int s=1;s<=5;s++)
        {
            System.out.print("enter the number"+s);
            a=i.nextInt();
            sum+=a;
        }
        float Sum=sum;
        float avg=Sum/5;
        System.out.print("sum is "+sum);
        System.out.print(" ");
        System.out.print("average is "+avg);
    }
}