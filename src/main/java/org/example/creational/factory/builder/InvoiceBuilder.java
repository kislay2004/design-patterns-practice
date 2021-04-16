package org.example.creational.factory.builder;

public class InvoiceBuilder {

    Address shipToAddress;
    Address billToAddress;

    int invoiceNumber;
    int orderNumber;

    String name;
    String phoneNumber;
    String emailId;

    String orderSummary;
    double totalAmount;
    double vat;
    double gst;
    double discount;
    String authSign;



    public Invoice build() {

        //gives us an opportunity to validate, or set default value and
        // that helps us avoiding inconsistent object

        if( authSign==null || authSign.isEmpty() ){
            authSign = "Manager";
        }

        validateInvoice();
        return new Invoice(this);
    }

    private void validateInvoice() {
        if(null== authSign || authSign.isEmpty()){
            throw new IllegalStateException("Auth Sign cannot be null or empty.");
        }
        if (invoiceNumber < 1) {
            throw new IllegalStateException("Invalid Invoice Number, must be > 0.");
        }
    }

    //notice the departure from setters. And, we can add some mandatory/validation checks
    public InvoiceBuilder invoiceNumber(int invoiceNumber) {

        this.invoiceNumber = invoiceNumber;
        return this;
    }

    public InvoiceBuilder shipToAddress(Address shipToAddress) {
        this.shipToAddress = shipToAddress;
        return this;
    }

    public InvoiceBuilder billToAddress(Address billToAddress) {
        this.billToAddress = billToAddress;
        return this;
    }

    public InvoiceBuilder orderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    public InvoiceBuilder name(String name) {
        this.name = name;
        return this;
    }

    public InvoiceBuilder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public InvoiceBuilder emailId(String emailId) {
        this.emailId = emailId;
        return this;
    }

    public InvoiceBuilder orderSummary(String orderSummary) {
        this.orderSummary = orderSummary;
        return this;
    }

    public InvoiceBuilder totalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    public InvoiceBuilder vat(double vat) {
        this.vat = vat;
        return this;
    }

    public InvoiceBuilder gst(double totalAmount) {
        this.gst = totalAmount;
        return this;
    }

    public InvoiceBuilder discount(double discount) {
        this.discount = discount;
        return this;
    }

    public InvoiceBuilder authSign(String authSign) {

        this.authSign = authSign;
        return this;
    }

}
