import java.util.*;
public class Day
{
    public static void main(String[] arg)
    {
        int No;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter Number:");
         No=sc.nextInt();

        if(No==1)
        {
            System.out.print("\n Sunday");
        }

        if(No==2)
        {
            System.out.print("\n Monday");
        }

        if(No==3)
        {
            System.out.print("\n Tuesday");
        }

        if(No==4)
        {
            System.out.print("\n Wednesday");
        }

        if(No==5)
        {
            System.out.print("\n Thursday");
        }

        if(No==6)
        {
            System.out.print("\n Friday");
        }

        if(No==7)
        {
            System.out.print("\n Saturday");
        }
        else{
            System.out.print("\n Invalid Day");
        }
    }
}   