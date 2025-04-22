package chapter10.classes.classes.should.be.small.single.responsibility.principle.srp.bad.example;

//Single Responsibility Principle (SRP)
//A class should have only one reason to change.
//
//This means it should only do one thing—like storing data, or processing logic—not both.

public class Invoice {
    public void calculateTotal() { /* logic */ }
    public void printInvoice() { /* UI logic */ }
    public void saveToDatabase() { /* DB logic */ }
}


