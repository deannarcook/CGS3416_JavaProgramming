import java.util.Scanner;

public class cook_deanna_hw3p2 
{
  public static void main(String[] args) 
  {
// scanner for user input
    Scanner s = new Scanner(System.in);

// asks user for input
    System.out.println("Enter a positive integer (enter an integer greater than 5 to stop) ");
    int usersInt = s.nextInt();

// declare & initialize variables
    int evenNumbers = 0;
    int oddNumbers = 0;
    int smallestInt = 6;
    int postiveNumbers = 1;
    int negativeNumbers = 0;
    int totalNumbers = 1;

    while (usersInt <= 5) 
    {
      totalNumbers++;

      if (usersInt >= 0) 
      {
// even or odd
        if (usersInt % 2 == 0) 
       	{
          evenNumbers++;
       	}
       	else
       	{
          oddNumbers++;
       	}
// find smallest integer
       	if (usersInt < smallestInt) 
       	{
          smallestInt = usersInt;	
       	}
// calculate numbers entererd
       	postiveNumbers++;

        System.out.println("Enter a positive integer (enter an integer greater than 5 to stop)");
        usersInt = s.nextInt();
      }
// tracks how many negative numbers were entered
      else  
      {
        negativeNumbers++;

        System.out.println("Enter a positive integer (enter an integer greater than 5 to stop)");
        usersInt = s.nextInt();
      }
      
    }
// calculates smallest int if users input consist of only negative numbers and a number greater than 5
    if (negativeNumbers == (totalNumbers - 1)) 
    {
      smallestInt = usersInt;
    }

// is the last number entered even or odd?
    if (usersInt >= 5 && usersInt % 2 == 0)
    {
      evenNumbers++;
    }
    else if (usersInt >= 5 && usersInt % 2 != 0) 
    {
      oddNumbers++;
    }

// output
    System.out.printf("Number of evens entered is: %d \n", evenNumbers);
    System.out.printf("Number of odds entered is: %d \n", oddNumbers);
    System.out.printf("Smallest value received is: %d \n", smallestInt);
    
// total numbers entered even or odd
    if (postiveNumbers % 2 == 0) 
    {
      System.out.println("Number of numbers entered is: \neven");
    }  
    else 
    {
      System.out.println("Number of numbers entered is: \nodd");
    }
  }   
}
