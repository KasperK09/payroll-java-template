package org.example;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    double hourlyRate = 16.78;
    double overtimeRate = 1.5; //multiplicative

    System.out.println("Welcome to the Payroll Program!");
    System.out.println("How many hours did you work this week?");
    
    Scanner scanner = new Scanner(System.in);
    int numberOfHoursWorked = scanner.nextInt();

    System.out.println("How many children do you have?");

    int numberOfChildren = scanner.nextInt();

    scanner.close();

    System.out.println("PayRoll Stub:\n");

    System.out.println("hours: " + numberOfHoursWorked);
    System.out.println("Rate: " + hourlyRate);
    System.out.println("Overtime: " )
    System.out.println("Gross: " calculatedGrossPay + "\n"); //need to add this class

    
  }
}

public double calculateGrossPay{
  double hourlyRate, overtimeRate, hours;
  
  if (hours <= 40) {
    return hours * hourlyRate;
  } else if (hours > 40) {
    return hours * 40 + ((hours - 40) * (hourlyRate * overtimeRate));
  }
}
