package chapter_3_Function.errorHandlingIsOneThing;

public class MixedLogicErrorHandling {
    public void processData(String input) {
        try {
            if (input == null) {
                throw new IllegalArgumentException("Input is null");
            }

            int number = Integer.parseInt(input);
            System.out.println("Processed number: " + number);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
