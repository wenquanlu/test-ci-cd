/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jenadle;

public class Calculator {
public int add (int a, int b) {
return a + b;
}
public int div (int a, int b) {
if (b == 0) {
throw new ArithmeticException("Division by 0");
} else {
return a / b;
}
}
public int isPositiveNumber (int a) {
if (a > 0) {
return 1;
} else if (a < 0) {
return -1;
} else {
return 0;
}
}
public static void main(String[] args) {
    System.out.println("hello");
}
}