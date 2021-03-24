package Project03;
import java.util.Scanner;

public class ChangeMaker {
	public static final int QUARTER = 25;
	public static final int DIME = 10;
	public static final int NICKEL = 5;
	public static final int PENNY = 1;

	public static void main(String[] args) {

//PREPARE
int amount, originalAmount, quarters, dimes, nickels, pennies;
Scanner userInputStream = new Scanner(System.in);
int a=10;
int b=5;
int c=15;
System.out.println((a++ - b * --c + a % b-- - c++ / --a));
//INPUT
	System.out.print("Enter a whole number of cents: ");
	originalAmount = userInputStream.nextInt();
	
//PROCESS
	amount = originalAmount;
	quarters= amount/QUARTER;
	amount=amount%QUARTER;
	dimes=amount/DIME;
	amount=amount%DIME;
	nickels=amount/NICKEL;
	amount=amount%NICKEL;
	pennies=amount;
	
	
//OUTPUT

}
}
