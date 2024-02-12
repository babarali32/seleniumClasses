package javaClassPractise;

public class ReturnMethodExample {

        // Void method without parameters
        public static void generateGreeting() {
            String greeting = "Hello, World!";
            // No return statement
            System.out.println(greeting);  // Corrected typo in the method name
        }

        public static void main(String[] args) {
            // Call the void method
            generateGreeting();

            // Since the method is void, you can't assign its result to a variable
            // The line below would result in a compilation error
            // String greetingMessage = generateGreeting();
        }
    }

