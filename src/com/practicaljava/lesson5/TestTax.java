
package com.practicaljava.lesson5;


import com.practicaljava.lesson5.Tax;

public class TestTax 
{
	public static void main(String[] args)
	{
		
		double grossIncome;	//local variables
		String state;
		int dependents;
		
		grossIncome = 50000;
		dependents = 2;
		state = "NJ";
		
		Tax t = new Tax(grossIncome, state, dependents);
		Tax t2 = new Tax(65000, "TX", 4);
		
		double yourTax = t.calcTax(); //calculating tax
		double hisTax = t2.calcTax();
		
		/*Example of static method that doesn't need to be 
		 *instantiated
		 */
		t.convertToEuros(yourTax);
		t2.convertToEuros(hisTax);
		//Print the result
		System.out.println("Normal tax is " + yourTax);
		
	}
}

