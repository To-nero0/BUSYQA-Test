package Test;
import java.util.Scanner;
public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        scientificcalculator sciCal = new scientificcalculator();
	        BasicCalculator basicCal = new BasicCalculator();

	  	        System.out.println("Enter two numbers: ");
	        int num1 = sc.nextInt();
	        int num2 = sc.nextInt();

	        System.out.println("Choose between these  operation (+, -, *, /, square, cube): ");
	        String operation = sc.next();

	        switch (operation) {
	            case "+":
	                System.out.println("Result: " + sciCal.add(num1, num2));
	                break;
	            case "-":
	                System.out.println("Result: " + sciCal.subtract(num1, num2));
	                break;
	            case "*":
	                System.out.println("Result: " + sciCal.multiply(num1, num2));
	                break;
	            case "/":
	                System.out.println("Result: " + sciCal.divide(num1, num2));
	                break;
	            case "square":
	                System.out.println("Result (square of num1): " + sciCal.square(num1));
	                break;
	            case "cube":
	                System.out.println("Result (cube of num1): " + sciCal.cube(num1));
	                break;
	            default:
	                System.out.println("Invalid operation!");
	                break;
	        }

	      System.out.println("Enter three numbers for addition: ");
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        System.out.println("Sum of three numbers: " + basicCal.add(a, b, c));

	        sc.close();
	    }
	}

	         
