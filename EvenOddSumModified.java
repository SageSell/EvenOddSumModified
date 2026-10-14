public class EvenOddSumModified {
    public static void main(String[] args) {
        // Create an int array of size 100
        int[] numbers = new int[100];

        // Use a for loop to put the numbers 1 to 100 into the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int sum = 0;

        // Use another loop with .length to print the number, check even/odd, and add to sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + "\teven");
            } else {
                System.out.println(numbers[i] + "\todd");
            }
        }

        // Print out the total sum outside of the loop
        System.out.println("Total Sum: " + sum);
    }
}