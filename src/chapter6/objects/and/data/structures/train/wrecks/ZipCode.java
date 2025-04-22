package chapter6.objects.and.data.structures.train.wrecks;

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
