package chapter_16_RefactoringSerialDate.messyCode;

public class LoanQualifier {
    public boolean isQualified(int age, double income) {
        if (age >= 18) {
            if (income > 50000) {
                return true;
            } else {
                if (income > 30000) {
                    if (age > 25) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
