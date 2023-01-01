package cook_deanna_hw1p1;
import java.util.Scanner;
public class cook_deanna_hw1p1 
{

    public static void main(String[] args) 
    {
        // user input
        System.out.println("What was the cost of the appetizer? Enter it now ");
        Scanner appetizerInput = new Scanner(System.in);
        float appetizer;
        appetizer = appetizerInput.nextFloat();
        
        System.out.println("What was the cost of the main course? Enter it now ");
        Scanner mainCourseInput = new Scanner(System.in);
        float mainCourse;
        mainCourse = mainCourseInput.nextFloat();
        
        System.out.println("What was the cost of the dessert? Enter it now ");
        Scanner dessertInput = new Scanner(System.in);
        float dessert;
        dessert = dessertInput.nextFloat();
        
        System.out.println("What was the cost of the Moscato? Enter it now ");
        Scanner wineInput = new Scanner(System.in);
        float wine;
        wine = wineInput.nextFloat();

        // subtotal
        double subtotal = appetizer + mainCourse + dessert + wine;

        System.out.println("Subtotal: " + subtotal);

        // total tax
        double totalTax = subtotal * .10;

        System.out.println("Tax: " + totalTax);

        // grand total
        double grandTotal = subtotal + totalTax;
        System.out.printf("Grand Total: %.2f", grandTotal);

        //
        System.out.println("Come again! Don't worry about the budget");

    }
    
}
