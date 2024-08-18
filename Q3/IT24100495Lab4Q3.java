import java.util.Scanner;
public class IT24100495Lab4Q3
{
	public static void main(String[] args)
	{
		System.out.print("Enter a number: ");
		Scanner obj = new Scanner(System.in);
		double num1 = obj.nextDouble();
		
		String msg = (num1<0)? "The number is: Negative":
				(num1>0)? "The number is: Positive": "The number is: Zero";

		
		System.out.print(msg);
	}
}		