package org.example;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    double hourlyRate = 16.78;
    double overtimeRate = 1.5; //multiplicative
    double SocialSecuityTax = 0.06;
    double FederalIncomeTax = 0.14;
    double StateIncomeTax = 0.05;
    double UnionDues = 10.00;

    System.out.println("Welcome to the Payroll Program!");
    System.out.println("How many hours did you work this week?");
    
    Scanner scanner = new Scanner(System.in);
    int numberOfHoursWorked = scanner.nextInt();

    System.out.println("How many children do you have?");

    int numberOfChildren = scanner.nextInt();

    double GrossPayCalculated = calculateGrossPay(hourlyRate, overtimeRate, numberOfHoursWorked);

    double HealthInsuranceCalculated = calculateHealthInsurancePayment(numberOfChildren);

    scanner.close();

    System.out.println("PayRoll Stub:\n");

    System.out.println("Hours: " + numberOfHoursWorked);
    System.out.println("Rate: " + hourlyRate);
    System.out.println("Gross: $" + GrossPayCalculated);

    System.out.println("\nTaxes:\n");

    System.out.println("Social Securuty Tax: " + (SocialSecuityTax * GrossPayCalculated));
    System.out.println("Federal Income Tax: " + (FederalIncomeTax * GrossPayCalculated));
    System.out.println("State Income Tax: " + (StateIncomeTax * GrossPayCalculated));

    System.out.println("\nOther Payments:\n");

    System.out.println("Union dues: $" + UnionDues);
    System.out.println("Health Insurance: $" + HealthInsuranceCalculated);

    System.out.println("\nNet Pay: " + ((GrossPayCalculated) - ((SocialSecuityTax * GrossPayCalculated) + (FederalIncomeTax * GrossPayCalculated) + (StateIncomeTax * GrossPayCalculated) + UnionDues + HealthInsuranceCalculated)));

     System.out.println("\nThank you for using the payroll program!\n");
  }

  //these need to be static or it complains
  public static double calculateGrossPay(double hourlyRate, double overtimeRate,double numberOfHoursWorked){
  
    if (numberOfHoursWorked <= 40) {
      return numberOfHoursWorked * hourlyRate;
    } else {
      return ((numberOfHoursWorked * 40) * hourlyRate) + ((numberOfHoursWorked - 40) * (hourlyRate * overtimeRate));
    }
  }

  public static int calculateHealthInsurancePayment(int numberOfChildren){
    if (numberOfChildren < 3) {
      return 15;
    } else {
      return 35;
    }
  }
}
