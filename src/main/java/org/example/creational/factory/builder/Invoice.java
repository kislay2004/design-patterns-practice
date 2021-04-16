package org.example.creational.factory.builder;

public class Invoice {

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


    //constructors -- constructors grew to be telescopic - time to introduce a builder ! :)

    /*
    public Invoice(Address shipToAddress, Address billToAddress, int invoiceNumber, int orderNumber, String name, String orderSummary, double totalAmount, int vat, String authSign) {
        this.shipToAddress = shipToAddress;
        this.billToAddress = billToAddress;
        this.invoiceNumber = invoiceNumber;
        this.orderNumber = orderNumber;
        this.name = name;
        this.orderSummary = orderSummary;
        this.totalAmount = totalAmount;
        this.vat = vat;
        this.authSign = authSign;
    }

    public Invoice(Address shipToAddress, Address billToAddress, int invoiceNumber, int orderNumber, String name, String phoneNumber, String emailId, String orderSummary, double totalAmount, int vat, int discount, String authSign) {
        this.shipToAddress = shipToAddress;
        this.billToAddress = billToAddress;
        this.invoiceNumber = invoiceNumber;
        this.orderNumber = orderNumber;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.orderSummary = orderSummary;
        this.totalAmount = totalAmount;
        this.vat = vat;
        this.discount = discount;
        this.authSign = authSign;
    }

    public Invoice(Address shipToAddress, Address billToAddress, int invoiceNumber, int orderNumber, String name, String phoneNumber, String emailId, String orderSummary, double totalAmount, double vat, double gst, double discount, String authSign) {
        this.shipToAddress = shipToAddress;
        this.billToAddress = billToAddress;
        this.invoiceNumber = invoiceNumber;
        this.orderNumber = orderNumber;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.orderSummary = orderSummary;
        this.totalAmount = totalAmount;
        this.vat = vat;
        this.gst = gst;
        this.discount = discount;
        this.authSign = authSign;
    }*/

    public Invoice(InvoiceBuilder invoiceBuilder) {
        this.shipToAddress = invoiceBuilder.shipToAddress;
        this.billToAddress = invoiceBuilder.billToAddress;
        this.invoiceNumber = invoiceBuilder.invoiceNumber;
        this.orderNumber = invoiceBuilder.orderNumber;
        this.name = invoiceBuilder.name;
        this.phoneNumber = invoiceBuilder.phoneNumber;
        this.emailId = invoiceBuilder.emailId;
        this.orderSummary = invoiceBuilder.orderSummary;
        this.totalAmount = invoiceBuilder.totalAmount;
        this.vat = invoiceBuilder.vat;
        this.gst = invoiceBuilder.gst;
        this.discount = invoiceBuilder.discount;
        this.authSign = invoiceBuilder.authSign;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "shipToAddress=" + shipToAddress.toString() +
                ", billToAddress=" + billToAddress.toString() +
                ", invoiceNumber=" + invoiceNumber +
                ", orderNumber=" + orderNumber +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailId='" + emailId + '\'' +
                ", orderSummary='" + orderSummary + '\'' +
                ", totalAmount=" + totalAmount +
                ", vat=" + vat +
                ", gst=" + gst +
                ", discount=" + discount +
                ", authSign='" + authSign + '\'' +
                '}';
    }

    public void printInvoice(){
        System.out.println(toString());
    }
}
