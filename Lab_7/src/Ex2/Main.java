package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = Integer.parseInt(scn.nextLine());
            int result = 100 / num;
            System.out.println("Result: " + result);
        } catch (ArithmeticException exp) {
            System.out.println("Cannot divide by zero.");
        } catch (NumberFormatException exp) {
            System.out.println("Invalid input. Please enter a number.");
        } catch (Exception exp) {
            System.out.println("Something went wrong: " + exp.getMessage());
        }
    }
}
