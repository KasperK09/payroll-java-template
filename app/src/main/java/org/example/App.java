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
    double HealthInsurance;

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

    System.out.println("hours: " + numberOfHoursWorked);
    System.out.println("Rate: " + hourlyRate);
    System.out.println("Gross: " + GrossPayCalculated); //need to add this class

    System.out.println("Taxes:\n");

    System.out.println("Social Securuty Tax: " + SocialSecuityTax);
    System.out.println("Federal Income Tax: " + FederalIncomeTax);
    System.out.println("State Income Tax" + StateIncomeTax);

    System.out.println("Other Payments:\n");

    System.out.println("Union dues:" + StateIncomeTax);
    System.out.println("Health Insurance:" + StateIncomeTax);

  }

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
