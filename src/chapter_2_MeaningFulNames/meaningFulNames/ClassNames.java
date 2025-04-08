package chapter_2_MeaningFulNames.meaningFulNames;

public class ClassNames {
    //1: Class names should be nouns or noun phrases
    //Good examples

    class Invoice {}
    class PaymentProcessor {}
    class UserProfile {}

    //Bad Example
    class DoPayment {}     // sounds like a method
    class HandleData {}    // sounds too vague

    //2:Use full words, not abbreviations
    //Good Example
    class Customer {}
    class PaymentProcessor1 {}

    //Bad Example
    class Cstmr {}   // hard to understand
    class PmtProc {} // unclear

    // Class names should not be verbs
    //good Example
    class BookManager {}
    class UserAccount {}
    class InvoiceCalculator {}

    //Bad Example
    class DoBookStuff {}
    class MngUsr {}
    class CalculateInvoice {}


}
