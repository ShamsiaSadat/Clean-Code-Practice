package chapter_6_ObjectsandDataStructures.trainWrecks;

// ZipCode class
public class ZipCode {
    private String code;

    public ZipCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code;
    }
}
