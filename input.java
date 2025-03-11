public class input {

    public static void main(String[] args) {
        System.out.println("hello");

        // Example usage of the summing methods
        int sum1 = sumTwoNumbers(5, 10);
        System.out.println("Sum of two numbers: " + sum1);

        int sum2 = sumArray(new int[]{1, 2, 3, 4, 5});
        System.out.println("Sum of array: " + sum2);

        int sum3 = sumVarArgs(1, 2, 3, 4, 5);
        System.out.println("Sum of varargs: " + sum3);
    }

    // Method to sum two numbers
    public static int sumTwoNumbers(int a, int b) {
        return a + b;
    }

    // Method to sum an array of integers
    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // Method to sum a variable number of arguments
    public static int sumVarArgs(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}