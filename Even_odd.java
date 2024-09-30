import java.util.*;
public class Even_odd
{
    public static void main(String[] arg)
    {
        int Num;
        System.out.print("\n Enter Number:");

        Scanner sc = new Scanner(System.in);
        Num=sc.nextInt();

        if(Num%2==0)
        {
            System.out.print("\n This number is Even");
        }
        else
        {
            System.out.print("\n This number is odd");
        }

    } 
}
