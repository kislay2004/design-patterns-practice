package org.example.creational.factory.abstractfactory;

import org.example.creational.factory.abstractfactory.parser.ParsingInterface;
import org.example.creational.factory.abstractfactory.parser.XmlParser;
import org.example.creational.factory.abstractfactory.responder.Responder;
import org.example.creational.factory.abstractfactory.responder.XmlResponder;

public class XmlProcessorFactory implements ProcessorFactory {

    public ParsingInterface getParser() {
        return new XmlParser();
    }

    public Responder getResponder() {
        return new XmlResponder();
    }


}
