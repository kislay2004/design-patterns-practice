package org.example.creational.factory.abstractfactory;

import org.example.creational.factory.abstractfactory.parser.JsonParser;
import org.example.creational.factory.abstractfactory.parser.ParsingInterface;
import org.example.creational.factory.abstractfactory.parser.XmlParser;
import org.example.creational.factory.abstractfactory.responder.JsonResponder;
import org.example.creational.factory.abstractfactory.responder.Responder;
import org.example.creational.factory.abstractfactory.responder.XmlResponder;

public class Controller {

    ProcessorFactory processorFactory;
    ParsingInterface parser;
    Responder responder;

    public Controller(ProcessorFactory processorFactory) {
        this.processorFactory = processorFactory;
    }

    public Controller() {

    }

    public void processDefault(String request){
        parser = new XmlParser();
        responder = new XmlResponder();

        parser.parse(request);

        //some other business log and finally respond.
        System.out.println(responder.getResponse());

    }


    public void processBasedOnTypeOfRequest(String request, String typeOfRequest){
        if("xml".equalsIgnoreCase(typeOfRequest)) {
            parser = new XmlParser();
            responder = new XmlResponder();
        }else if("json".equalsIgnoreCase(typeOfRequest)){
            parser = new JsonParser();
            responder = new JsonResponder();
        }  // what if we have one more type.. as we see this if- else logic keeps growing.. we need a better way.. :)

        System.out.println("request type is:" + typeOfRequest);

        parser.parse(request);

        //some other business log and finally respond.
        System.out.println(responder.getResponse());

    }

    // refactored version...get rid of object creation logic, this is a trivial example, but imagine object creation itself is complex.
    // much cleaner now ...
    public void processUsingAbstractFactory(String request){

        //initialize concrete objects.
        parser = processorFactory.getParser();
        responder = processorFactory.getResponder();

        parser.parse(request);
        //some other business log and finally respond.

        System.out.println(responder.getResponse());

    }

}
