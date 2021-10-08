//Java Program to determine the simple intrest.
import java.util.Scanner;
public class Simpleintrest
{
  
	public static void main(String[] args) {
    
	  Scanner input= new Scanner(System.in);
	  System.out.print("Principal (In Rupees: ");
	  int Principal = input.nextInt();
		System.out.print("Rate (In %) : ");
		double Rate = input.nextDouble();
		System.out.print("Time (In years): ");
		int Time = input.nextInt();
		double si=(Principal*Rate*Time)/100;
		System.out.println("Simple Intrest: "+si);
    
	}
  
}
