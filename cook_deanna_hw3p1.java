import java.util.Scanner;

public class Cook_deanna_hw3p1 
{
    public static void main(String[] args) 
    {
       Scanner s = new Scanner(System.in);

// input positive integer
		System.out.println("Enter one positive integer");
		int positiveInteger = s.nextInt();
                
              while(positiveInteger < 0)
              {
                System.out.println("Invalid input. Enter one positive integer");
                positiveInteger = s.nextInt();
              }
		

// input negative integer
		System.out.println("Enter one negative integer");
		int negativeInteger = s.nextInt();
                
              while(negativeInteger > 0)
              {
                System.out.println("Invalid input. Enter one negative integer");
                negativeInteger = s.nextInt();
              }
		
// output difference
		int difference = positiveInteger - negativeInteger;
		System.out.printf("Difference: %d \n", difference);

// integer 1 even or odd
		if (positiveInteger % 2 == 0) 
		{
			System.out.println("Integer 1 is even");
		}
		
		else
		{
			System.out.println("Integer 1 is odd");
		}

// integer 2 even or odd
		if (negativeInteger % 2 == 0) 
		{
			System.out.println("Integer 2 is even");
		}

		else
		{
            System.out.println("Integer 2 is odd");
		}
// difference even or odd
		if (difference % 2 == 0) 
		{
			System.out.println("Difference between integers is even");
		}

		else	
		{
			System.out.println("Difference between integers is odd");
		}
    }
    
}
