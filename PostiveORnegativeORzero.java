import java.util.Scanner;

public class PostiveORnegativeORzero
{
	public static void main(String[] args) 
	{
		int p=1,n=1,z=1;
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		if(num<0)
			n++;
		else if(num>1)
			p++;
		else if(num ==0)
			z++;
		
	}
	System.out.println("Count of positive: "+p+"Count of negative: "+n+" Zeros are: "+z);
   
}