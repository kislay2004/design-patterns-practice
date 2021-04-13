package org.example.creational.factory.abstractfactory.responder;

public class XmlResponder implements Responder{
    @Override
    public String getResponse() {
        return "A sample xml response.";
    }
}
