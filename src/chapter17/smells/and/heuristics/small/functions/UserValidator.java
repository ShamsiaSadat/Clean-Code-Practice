package chapter17.smells.and.heuristics.small.functions;
//BadExample
public class UserValidator {
    public boolean validate(String name, String email, int age) {
        if (name == null || name.isEmpty()) return false;
        if (!email.contains("@")) return false;
        if (age < 18 || age > 100) return false;
        return true;
    }
}
