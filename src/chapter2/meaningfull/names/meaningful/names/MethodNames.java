package chapter2.meaningfull.names.meaningful.names;

public class MethodNames {
    //1. Method names should be verbs or verb phrases
    void printInvoice() {}
    void calculateTotal() {}
    void sendEmail() {}

    //Bad Example
    void invoicePrinter() {}
    void totalCalculator(){}

    //2. method names must describe the purpose
    void saveUserToDatabase() {}
    void calculateShippingCost() {}
    void getCustomerAddress() {}


    //Bad Example
    void doIt() {}
    void handle() {}
    void process() {}


    //3. must be full words — no abbreviations
    void collectNames(){}
    void printUserNames() {}

    //Bad Example
    void calcTot() {}
    void prtInv() {}


}
