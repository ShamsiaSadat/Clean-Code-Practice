package chapter3.function.exception;

public class FileReader {
    public static void readFile(String fileName){

        if(fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("File name cannot be empty or null");
        }
        System.out.println("File Name" + fileName);
    }

    public static void main(String[] args) {
        try {
            readFile("document.txt");
            readFile("");
        } catch (IllegalArgumentException e){
            System.out.println("Caught Exception: " +e.getMessage());
        }
    }
}
