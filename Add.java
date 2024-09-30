import java.util.*;
public class Add
{
	public static void main(String[] arg)
    	{
		int N1;
		int N2;
		int Sum;
		
		Scanner sc= new Scanner(System.in);

                System.out.print("\n Enter First Number :");
				N1=sc.nextInt();
				System.out.print("\n Enter Second Number :");
				N2=sc.nextInt();
				
				Sum=N1+N2;
				System.out.print("\n Addition of Two Numbers is :"+Sum);


	}
}