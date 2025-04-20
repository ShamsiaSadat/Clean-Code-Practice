package chapter_17_SmellsAndHeuristics.DRY;

public class SalaryCalculator {
    public double calculateYearly(double monthlySalary) {
        return monthlySalary * 12;
    }

    public double calculateBonus(double monthlySalary) {
        return (monthlySalary * 12) * 0.1;
    }

}
