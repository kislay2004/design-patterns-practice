package org.example.creational.factory.builder;

public class InvoiceAppClient {

    public static void main(String args[]){

        Invoice invoice = new InvoiceBuilder()
                .invoiceNumber(123)
                .billToAddress(new Address())
                .shipToAddress(new Address())
                .orderNumber(111)
                .orderSummary("item#1: Ice cream")
                .build();


        invoice.printInvoice();



    }
}
