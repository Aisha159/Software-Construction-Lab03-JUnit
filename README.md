# Software Construction Lab 03: JUnit Unit Testing

**Course:** Software Construction (5th Semester, B.S. Software Engineering)  
**Institution:** University of Engineering and Technology, Abbottabad Campus  
**Instructor:** Engr. Rizwan Shah  
**Date:** September 01, 2026[cite: 1]  
**Repository:** `Aisha159/Software-Construction-Lab03-JUnit`  

---

## 📌 Lab Objective
The objective of this lab is to introduce unit testing in Java using the JUnit framework within NetBeans IDE[cite: 1]. Students learn how to create Java classes, write unit tests for class methods, test boundary/exceptional conditions, and interpret automated test execution results[cite: 1].

---

## 🛠 In-Lab Tasks Implemented

* **Lab Task 1 - Temperature Converter (`TemperatureConverter.java`):**[cite: 1]
  * **Objective:** Test correctness of temperature conversion formulas between Celsius, Fahrenheit, and Kelvin[cite: 1].
  * **Implementation:** Converts between units using mathematical formulas ($0^\circ\text{C} \rightarrow 32^\circ\text{F}$, $100^\circ\text{C} \rightarrow 212^\circ\text{F}$)[cite: 1].
  * **Testing:** Round-trip checks and approximate floating-point equality verification using `assertEquals(expected, actual, 0.01)`[cite: 1].

* **Lab Task 2 - Bank Account Operations (`BankAccount.java`):**[cite: 1]
  * **Objective:** Test class invariants and exceptional conditions (negative balance, overdraft)[cite: 1].
  * **Implementation:** Core deposit and withdrawal logic[cite: 1].
  * **Testing:** Verifies balance increases on valid deposits and decreases on valid withdrawals[cite: 1]. Asserts `IllegalArgumentException` on negative deposits and `IllegalStateException` on overdraft withdrawals[cite: 1].

* **Lab Task 3 - String Utility / Palindrome Checker (`StringUtil.java`):**[cite: 1]
  * **Objective:** Use JUnit to test logic, non-alphanumeric filtering, and case sensitivity in string operations[cite: 1].
  * **Implementation:** Checks if a string is a palindrome after stripping non-alphanumeric characters and converting to lowercase[cite: 1].
  * **Testing:** Validates standard palindromes ("madam"), case-insensitive cases ("RaceCar"), non-palindromes ("hello"), and edge inputs (`null` or empty strings returning `false`)[cite: 1].

* **Lab Task 4 - Simple Timer Utility (`TimerUtil.java`):**[cite: 1]
  * **Objective:** Test logic handling elapsed-time computation and boundary conditions[cite: 1].
  * **Implementation:** Computes elapsed seconds given `start` and `end` times[cite: 1].
  * **Testing:** Tests normal bounds (start = 10, end = 25 $\rightarrow$ 15s), boundary cases (start = 0, end = 0 $\rightarrow$ 0s), and exception handling (`end < start` throwing `IllegalArgumentException`)[cite: 1].

* **Lab Task 5 - Shopping Cart Mini Case Study (`ShoppingCart.java`):**[cite: 1]
  * **Objective:** Combine multiple test assertions and simulate business rules[cite: 1].
  * **Implementation:** Dynamic list management allowing items to be added, removed, counted, or cleared[cite: 1].
  * **Testing:** Asserts item count increments upon adding, decrements upon removal, resets to 0 on clear, and ensures removing non-existent items does not throw errors[cite: 1].

---



