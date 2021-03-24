//Jacob Vaught
//9-14-2020
//using JOptionPanes to ask input from user and do a few calculations
//Due Date is 9-16-2020
//Project03
package Project03;
import javax.swing.JOptionPane; 
//CONSTANTS
public class Egg_Calc_MdDF {
//MdDF is short for Meadowdale Dairy Farm
public static final double PRICE_PER_DOZEN_BROWN_EGGS = 3.25;
public static final double PRICE_PER_SINGLE_BROWN_EGG = 0.45;
public static final int DOZEN = 12;
public static void main(String[] args) {
	//List Of VARIABLES
	String input = JOptionPane.showInputDialog("How many eggs did you buy?");
	int Number_of_eggs_purchased;
	int number_of_egg_cartons;
	int number_of_loose_eggs;
	double Total_Price;
	double Total_Dozen_Price;
	double Total_Loose_Egg_Price;
	//INPUT
	Number_of_eggs_purchased = Integer.parseInt(input);
	//CALCULATIONs
	number_of_egg_cartons= Number_of_eggs_purchased / DOZEN;
	number_of_loose_eggs= Number_of_eggs_purchased % DOZEN;
	Total_Dozen_Price=number_of_egg_cartons*PRICE_PER_DOZEN_BROWN_EGGS;
	Total_Loose_Egg_Price=number_of_loose_eggs*PRICE_PER_SINGLE_BROWN_EGG;
	Total_Price=Total_Loose_Egg_Price+Total_Dozen_Price;
    //OUTPUT
 	JOptionPane.showMessageDialog(null, "You ordered "+Number_of_eggs_purchased+" organic brown eggs. \nThat's "+number_of_egg_cartons+" dozens at $"+PRICE_PER_DOZEN_BROWN_EGGS+" per dozen and\n "+number_of_loose_eggs+" loose egg(s) at $"+PRICE_PER_SINGLE_BROWN_EGG+" per egg\n for a total of $"+Total_Price);
	System.exit(0);
}//closing bracket for method main
}//closing bracket for public class