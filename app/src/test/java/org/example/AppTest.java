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
  void testOvertimeGrossPay() {
    double result = App.calculateGrossPay(16.78, 1.5, 50);

    double expected = (40 * 16.78)
        + (10 * (16.78 * 1.5));

    assertEquals(expected, result, 0.01);
  }

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