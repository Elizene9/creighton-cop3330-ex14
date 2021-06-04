/*
 * UCF COP 3330 Summer 2021 Assignment 1 Solutions
 * Copyright 2021 Charlene Creighton
 */

/*
Write a simple program to compute the tax on an order amount.
The program should prompt for the order amount and the state.
If the state is “WI,” then the order must be charged 5.5% tax.
The program should display the subtotal, tax, and total for Wisconsin residents
but display just the total for non-residents.

Example Output
What is the order amount? 10
What is the state? WI
The subtotal is $10.00.
The tax is $0.55.
The total is $10.55.
Or

What is the order amount? 10
What is the state? MN
The total is $10.00

Constraints
Implement this program using only a simple if statement—don’t use an else clause.
Ensure that all money is rounded up to the nearest cent.
Use a single output statement at the end of the program to display the program results.
 */

package Exercise_14;

import java.util.Scanner;
public class ex14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");

        double order = input.nextDouble();

        System.out.print("\nWhat is the state? ");

        var state = input.next();

        double tax;
        if (state.equals("WI")) {
            tax = order * .055;
            System.out.printf("\nThe tax is $%.2f\nThe total is $%.2f", tax, order + tax);
            System.exit(0);
        }

        System.out.printf("\nThe total is $%.2f", order);

    }
}
