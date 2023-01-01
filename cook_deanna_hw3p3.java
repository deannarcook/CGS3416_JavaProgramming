// inheritance: polymorphism
// polymorphism: method overloading, method overriding, operator polymorphism, constructor overloading
// encapsulation
// abstraction
import java.util.Scanner;
class Account
{
    double accountBalance;
    double accountInterestRate;


    void createNewInquiry(String name_, double interestRateAsPercentage)
    {
        String accountHolder = name_;
        System.out.println("\nAn  account for " + accountHolder + " will earn " + interestRateAsPercentage + "% interest per year compounded daily."); 


    }


    void deposit(double depositInDollars)
    {
        accountBalance = depositInDollars;
    }
}


class Savings extends Account
{
    Savings(double interestRateAsPercentage)
    {
        accountInterestRate = interestRateAsPercentage/100;


    }
      
    @Override
    void deposit(double depositInDollars)
    {
        accountBalance =  depositInDollars;
        System.out.printf("\nYou're intial investment is $%.2f",depositInDollars);
    }
    
    void calculatePotentialInterest(double initialInvestment)
    {
       double dailyInterestRate = accountInterestRate/365;
       double previousFinalBalance = initialInvestment;
       
       for (int dayCounter = 1; dayCounter <= 3650; dayCounter++) 
       {
                  double interestEarned = previousFinalBalance * dailyInterestRate;
                  double currentBalance = previousFinalBalance + interestEarned;
                  previousFinalBalance = currentBalance;


                  if (dayCounter == 365)
                  {
                        System.out.printf("\n\nBased on your intial investment, in 1 year your account will have a balance of: $%.2f \n", currentBalance );
                  }


                  if (dayCounter == 1825)
                  {
                        System.out.printf("In 5 years your savings account will have a balance of: $%.2f \n", currentBalance );                 }


                  if (dayCounter == 3650)
                  {
                        System.out.printf("In 10 years your account will have a balance of: $%.2f \n", currentBalance );
                  }


       }
    }
}


public class PerDiem
{
    public static void main(String[] args) 
    {
      Scanner s = new Scanner(System.in);
      
      System.out.println("Welcome to the PerDiem! We are going to help you calulate how much you can earn from a savings account that compounds interest daily. To begin please enter your name.");
      String newAccountHolderName = s.nextLine();
      
      System.out.println("\nNow enter your yearly interest rate as a percent");
      Double interestRate = s.nextDouble();
      
      Account newAccount = new Account();


      newAccount.createNewInquiry(newAccountHolderName, interestRate);
     
      System.out.println("\nPlease enter an initial investment.");
      double initialInvestment = s.nextDouble();
     
      Savings savingsTransaction = new Savings(interestRate);
       
      savingsTransaction.deposit(initialInvestment);
      
      savingsTransaction.calculatePotentialInterest(initialInvestment);




       
    }
      
      
} 
