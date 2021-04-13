package org.example.creational.factory.abstractfactory;

import org.example.creational.factory.abstractfactory.parser.ParsingInterface;
import org.example.creational.factory.abstractfactory.responder.Responder;

public interface ProcessorFactory {

    ParsingInterface getParser();
    Responder getResponder();
}
