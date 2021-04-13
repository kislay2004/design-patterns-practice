package org.example.creational.factory.abstractfactory;

import org.example.creational.factory.abstractfactory.parser.JsonParser;
import org.example.creational.factory.abstractfactory.parser.ParsingInterface;
import org.example.creational.factory.abstractfactory.responder.JsonResponder;
import org.example.creational.factory.abstractfactory.responder.Responder;
import org.example.creational.factory.abstractfactory.responder.XmlResponder;

public class JsonProcessorFactory implements ProcessorFactory {

    public ParsingInterface getParser() {
        return new JsonParser();
    }

    public Responder getResponder() {
        return new JsonResponder();
    }


}
