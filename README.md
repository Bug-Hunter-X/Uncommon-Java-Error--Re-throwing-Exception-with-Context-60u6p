# Uncommon Java Error: Re-throwing Exception with Context

This repository demonstrates a scenario in Java where an exception is caught and then re-thrown with a more informative `RuntimeException`, adding crucial context for debugging. The code also includes a `finally` block for proper resource management.

## Bug Description
The program attempts to divide by zero. While the `ArithmeticException` is caught, it's then wrapped in a `RuntimeException` to provide more specific context than the original exception.