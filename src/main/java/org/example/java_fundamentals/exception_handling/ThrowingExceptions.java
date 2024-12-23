package org.example.java_fundamentals.exception_handling;

public class ThrowingExceptions {
    public static void main(String[] args) {
        validateAge(-1);
    }

    public static void validateAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

     // OUT

    /* Exception in thread "main" java.lang.IllegalArgumentException: Age cannot be negative
	at org.example.JavaFundamentals.exceptionHandling.throwingExceptions.validateAge(throwingExceptions.java:10)
	at org.example.JavaFundamentals.exceptionHandling.throwingExceptions.main(throwingExceptions.java:5) */
}
