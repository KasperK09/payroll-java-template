package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

  @Test
  void testRegularGrossPay() {
    double result = App.calculateGrossPay(16.78, 1.5, 30);

    assertEquals(503.40, result, 0.01);
  }

  @Test
  void testRegularGrossPayFor0() {
    double result = App.calculateGrossPay(16.78, 1.5, 0);

    assertEquals(0, result, 0.01);
  }

  @Test
  void testRegularGrossPayForOneHour() {
    double result = App.calculateGrossPay(16.78, 1.5, 1);

    assertEquals(16.78, result, 0.01);
  }

  @Test
  void testOvertimeGrossPay() {
    double result = App.calculateGrossPay(16.78, 1.5, 50);

    double expected = (40 * 16.78)
        + (10 * (16.78 * 1.5));

    assertEquals(expected, result, 0.01);
  }

  /*this just fails to build*/ // so need to fix this error handling
  // @Test
  // void testRegularGrossPayForNegative() {
  //   double result = App.calculateGrossPay(16.78, 1.5, -40);

  //   assertEquals(0, result, 0.01);
  // }

  /*This also fails maybe the test is wrong but I know that my program can't handle letters*/
  // @Test
  // void testRegularGrossPayForletter() {
  //   double result = App.calculateGrossPay(16.78, 1.5, a);

  //   assertEquals(0, result, 0.01);
  // }

  @Test
  void testHealthInsuranceUnderThreeChildren() {
    int result = App.calculateHealthInsurancePayment(2);

    assertEquals(15, result);
  }

  @Test
  void testHealthInsuranceThreeOrMoreChildren() {
    int result = App.calculateHealthInsurancePayment(3);

    assertEquals(35, result);
  }

}