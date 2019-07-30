import java.util.*;
public class Calci
{
	public static int add(int x, int y)
	{
		return (x+y);
	}
	public static int subtract(int x, int y)
	{
		return (x-y);
	}
	public static int multiply(int x, int y)
	{
		return (x*y);
		System.out.println("Multiply function changed");
	}
	public static int divide(int x, int y)
	{
		return (x/y);
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x,y,choice;
		System.out.println("Enter two numbers");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Select an operation:\n 1. Add\n 2. Subtract\n 3. Multiply\n 4. 			Divide");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1: add(x,y);
				break;
			case 2: subtract(x,y);
				break;
			case 3: multiply(x,y);
				break;
			case 4: divide(x,y);
				break;
			default: System.out.println("INVALID CHOICE");
		}
	}
}
