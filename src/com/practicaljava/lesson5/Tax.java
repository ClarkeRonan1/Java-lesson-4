package com.practicaljava.lesson5;



public class Tax 
{
	double grossIncome;
	String state;
	int dependents;
	static int customerCounter;
	/*
	 * static varables are variables accessible
	 * from every different instance.
	 * whenever it's modified in one instance, this changes
	 * the original which effects every instance
	 */
	
	//Add code for constructor
	Tax(double grossIncome,String state, int dependents)
	{
		this.grossIncome = grossIncome;
		this.state = state;
		this.dependents = dependents;
		/*This means that the class variable
		 * grossIncome is now being set to the value
		 * of grossIncome that has just been passed
		 * into the constructor.
		 */
		
		//This keeps track of the number of customers
		customerCounter++;
		System.out.println("Preparing tax data for customer #" + customerCounter);
	}
	
	//Implement a static method for understanding
	static void convertToEuros(double taxInDollars)
	{
		
		System.out.println("Tax in Euros: " + taxInDollars/1.25);
	}
	
	
	//Add a method to calculate tax
	public double calcTax()
	{
		double stateTax = 0;
		
		//Check the gross income
		if(grossIncome < 30000)
		{
			stateTax = grossIncome * 0.05;
		}
		else
		{
			stateTax = grossIncome * 0.06;
		}
		
		return stateTax;
	}
	
	public String calcState()
	{
		switch(state)
		{
		case "NY":
				System.out.println("Tax by NY law");
				break;
				
		case "NJ":
			System.out.println("Tax by NJ law");
			break;
			
		default:
			System.out.println("Incorrect state");
		}
		return state;
	}
}
