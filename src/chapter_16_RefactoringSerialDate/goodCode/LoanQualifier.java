package chapter_16_RefactoringSerialDate.goodCode;

public class LoanQualifier {
    public boolean isQualified(int age, double income) {
        if (!isAdult(age)) return false;
        if (hasHighIncome(income)) return true;
        return hasModerateIncomeAndOlder(age, income);
    }

    private boolean isAdult(int age) {
        return age >= 18;
    }

    private boolean hasHighIncome(double income) {
        return income > 50000;
    }

    private boolean hasModerateIncomeAndOlder(int age, double income) {
        return income > 30000 && age > 25;
    }
}
