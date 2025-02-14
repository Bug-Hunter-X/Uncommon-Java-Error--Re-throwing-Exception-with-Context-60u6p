public class UncommonErrorExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            // Handle the exception properly (log, retry, etc.)
            System.err.println("ArithmeticException caught: " + e.getMessage());
            //This is the uncommon part
            throw new RuntimeException("Something went terribly wrong!",e); // Re-throw with a more specific message 
        } finally {
            System.out.println("This will always execute");
        }
    }
}