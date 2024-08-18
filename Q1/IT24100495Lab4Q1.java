import java.util.Scanner;

public class IT24100495Lab4Q1
{
	public static void main(String[]args)
	{
		System.out.print("Enter a number: ");
		Scanner obj = new Scanner(System.in);
		double num = obj.nextDouble();

		if(num>0){
			System.out.println("number is:Positive");
		}
		else if (num<0){
			System.out.println("The number is:Negative");
		}
		else{
			System.out.println("The number is zero");
		}
			
				
				
			
		
	}		
}				
		