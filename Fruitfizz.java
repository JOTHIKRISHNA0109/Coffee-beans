import java.util.Scanner;
public class Fruitfizz
{
	public static void main(String[] args) {
	    Scanner S=new Scanner(System.in);
	    int number= S.nextInt();
	    if (number%3==0 && number%5==0){
	        System.out.println("FruitFizz");
	    }
	    else if(number%3==0){
	        System.out.println("Fruit");
	    }
	    else if(number%5==0){
	        System.out.println("Fizz");
	    }
		//System.out.println(number);
	}
}
