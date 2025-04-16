package chapter_8_boundaries.usingThirdPartyCode;
import com.google.gson.Gson;

public class GsonTest {

    public static void main(String[] args) {
        Gson gson = new Gson();
        String json = gson.toJson("Hello Clean Code!");
        System.out.println(json);  // Should print: "Hello Clean Code!"
    }

}
