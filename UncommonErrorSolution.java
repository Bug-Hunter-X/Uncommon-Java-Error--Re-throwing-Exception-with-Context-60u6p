public class UncommonErrorSolution {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            //Improved Exception Handling
            System.err.println("Error: Division by zero detected.  Original message:" + e.getMessage());
            //Instead of re-throwing RuntimeException, handle more gracefully
            //Log the exception to a file or database for monitoring
            //Notify the user or administrator
            //Implement a recovery strategy or fallback mechanism
            //For demonstration, we are exiting the program gracefully.
            System.exit(1); //Exit with error code
        } finally {
            System.out.println("This will always execute");
        }
    }
} 