package chapter_17_SmellsAndHeuristics.smallFunctions;

public class GoodUserValidator {

    public boolean validate(String name, String email, int age) {
        return isNameValid(name) && isEmailValid(email) && isAgeValid(age);
    }

    private boolean isNameValid(String name) {
        return name != null && !name.isEmpty();
    }

    private boolean isEmailValid(String email) {
        return email != null && email.contains("@");
    }

    private boolean isAgeValid(int age) {
        return age >= 18 && age <= 100;
    }

}
