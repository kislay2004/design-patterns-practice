package org.example.creational.factory.abstractfactory;



/**
 * Abstract Factory is about creators who needs a particular object/product - but the creation part is abstracted in a
 * different abstraction layer, called abstract factory.
 *
 * The creators only relies on this abstraction to create the required objects. Particularly, useful if we have few family of objects
 * that needs to be created together.
 *
 */
public class AbstractFactoryDemo {


    /*
    * Lets say we have an use case, where there are couple of products, say Parser and Responder.
    * And, we have few different types - Json, Xml and Plaintext
    * And, we need in class called Controller. Let try to see how it will without any factory. And, then we will refactor.
    * */

    public static void main(String[] args) {

        System.out.println("Demo 1: default processing -- start");
        Controller controller1 = new Controller();
        controller1.processDefault("Request");
        System.out.println("*****  Demo 1 -- end *******");

        System.out.println("Demo 2:  processing by passing type of request as xml -- start");
        Controller controller2 = new Controller();
        controller2.processBasedOnTypeOfRequest("Request", "xml");
        System.out.println("*****  Demo 2 -- end *******");



        System.out.println("Demo 3:  processing by using abstract factory -- start");

        Controller controller3 = new Controller(new JsonProcessorFactory());
        controller3.processUsingAbstractFactory("Request");

        System.out.println("*****  Demo 3 -- end *******");
    }


}


