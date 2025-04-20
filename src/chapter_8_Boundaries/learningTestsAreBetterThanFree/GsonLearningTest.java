package chapter_8_Boundaries.learningTestsAreBetterThanFree;

import com.google.gson.Gson;

public class GsonLearningTest {
    static class User {
        String name;
        int age;
    }

    public static void main(String[] args) {
        Gson gson = new Gson();

        // Test 1: Object to JSON
        User user = new User();
        user.name = "Alice";
        user.age = 25;

        String json = gson.toJson(user);
        System.out.println("JSON: " + json);

        // Test 2: JSON to Object
        String inputJson = "{\"name\":\"Bob\",\"age\":30}";
        User user2 = gson.fromJson(inputJson, User.class);
        System.out.println("User name: " + user2.name);
        System.out.println("User age: " + user2.age);
    }
}
