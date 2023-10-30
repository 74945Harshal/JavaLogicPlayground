import java.util.Scanner;

public class DAY3_6 
{

	public static void main(String[] args) 
	{
		int x;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		x=sc.nextInt();
		
		if (x%4==0 && x%7==0)
		{
			System.out.println("Four-seven");
		}
		
		else if (x%4==0 )
		{
			System.out.println("Four");
		}
		else if (x%7==0 )
		{
			System.out.println("Seven");
		}
		

	}

}
