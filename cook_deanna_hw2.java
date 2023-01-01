import java.util.Scanner

public class cook_deanna_hw2.java
{

	public static void main (String[] args) 
	{
		
		Scanner s = new Scanner(System.in);

		System.out.println("How much can you afford for meals be day. Enter it now ");
		double mealBudget;
		mealBudget = s.nextDouble();
		if (mealBudget < 0) 
		{
			System.out.println("You entered a negative number, the program will now exit");
			System.exit(0);
		}

		System.out.println("How much can you afford for transportation per day. Enter it now ");
		double transportationBudget;
		transportationBudget = s.nextDouble();
		if (transportationBudget < 0)
		{
			System.out.println("You entered a negative number, the program will now exit");
			System.exit(0);
		}

		System.out.println("How much can you afford for activities per day. Enter it now ");
		double activitiesBudget;
		activitiesBudget = s.nextDouble();
		if (activitiesBudget < 0)
		{
			System.out.println("You entered a negative number, the program will now exit");
			System.exit(0);
		}
		
		// meal level
		if (mealBudget <= 15.00) 
		{
			System.out.println("You can afford bronze meals");
		}        
		else if (mealBudget <= 30.00) 
		{
			System.out.println("You can afford silver meals");	
		}      
		else
		{
			System.out.println("You can afford gold meals");
		}

		// transportation level
		if (transportationBudget <= 50.00) 
		{
			System.out.println("You can afford bronze transportation");
		}
		else if (transportationBudget <= 60.00)
		{
			System.out.println("You can afford silver transportation");
		}
		else
		{
			System.out.println("You can afford gold transportation");
		}

		// activities level
		if (activitiesBudget <= 40.00) 
		{
			System.out.println("You can afford bronze activities");
		}
		else if (activitiesBudget <= 80.00) 
		{
			System.out.println("You can afford silver activities");	
		}
		else 
		{
			System.out.println("You can afford gold activities");
		}

		double totalBudget = mealBudget + transportationBudget + activitiesBudget;

		System.out.printf("Total you can spend per day: %.2f", totalBudget);

	}

}

// algorithim
// input: user's vacation trip budget for meals, transportation, and activities
// output: total vacatoin budget and the type of vacation user can afford; double data type; print two digits after decimal point

// pseudocode
// set up an 3 double data type variables to hold the values that user inputs indicating how much can be spent on meals, transportation, and budget

// double totalbudget = mealbudget + transportationbudget + activitiesbudget
// print ("Based on the information you've entered your daily vacation budget is: " + totalbudget)
// if (mealbudget <= 15.00)
// {you can afford bronze level meals}
// else if (mealbudget <= 30.00)
// {you can afford silver level meals}
// else
// {you can afford gold level meals}

// if (transportationbudget <= 50.00)
// {you can afford bronze level transportation}
// else if (transportationbudget <= 60.00)
// {you can afford silver level transportation}
// else
// {you can afford gold level transportation}

// if (transportationbudget <= 40.00)
// {you can afford bronze level activities}
// else if (transportationbudget <= 60.00)
// {you can afford silver level activities}
// else
// {you can afford gold level activities}