package chapter_3_Function.errorHandlingIsOneThing;

public class Processor {
    public int parseInput(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input is null");
        }
        return Integer.parseInt(input);
    }

    public void process(int number) {
        System.out.println("Processed number: " + number);
    }

    public void run(String input) {
        try {
            int number = parseInput(input);  // parsing handled separately
            process(number);                 // business logic separated
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.run("42");     //Good input
        processor.run("abc");    //Causes NumberFormatException
        processor.run(null);     //Causes IllegalArgumentException
    }
}
