# Lab Task 01 - Temperature Converter

## Objective
Test the correctness of temperature conversion formulas between Celsius, Fahrenheit, and Kelvin using JUnit in NetBeans.

## Implementation
Implemented methods in `TemperatureConverter.java`:
- `celsiusToFahrenheit(double c)`
- `fahrenheitToCelsius(double f)`
- `celsiusToKelvin(double c)`

## Unit Tests
Tests in `TemperatureConverterTest.java` verify known conversions, round-trip checks, and floating-point assertions (`assertEquals(expected, actual, 0.01)`).

### Homework 1: Enhanced Calculator
* **Implementation:** `Calculator1.java`
  * Implements `add()`, `subtract()`, `multiply()`, `divide()`, `power()`, and `modulus()`.
  * Throws `IllegalArgumentException` with "Cannot divide by zero." for division or modulus by zero.
* **Testing:** `Calculator1Test.java`
  * Uses `@BeforeEach` and `@AfterEach` lifecycle annotations to manage instance setup and teardown.
  * Validates power operations across positive, zero, and negative exponents.
  * Tests boundary conditions and exception handling using `assertThrows`.
