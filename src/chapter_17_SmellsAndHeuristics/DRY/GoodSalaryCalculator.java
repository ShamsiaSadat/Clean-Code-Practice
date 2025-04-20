package chapter_17_SmellsAndHeuristics.DRY;

public class GoodSalaryCalculator {

    public double calculateYearly(double monthlySalary) {
        return yearlySalary(monthlySalary);
    }

    public double calculateBonus(double monthlySalary) {
        return yearlySalary(monthlySalary) * 0.1;
    }

    private double yearlySalary(double monthlySalary) {
        return monthlySalary * 12;
    }
}
