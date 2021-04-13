package org.example.creational.factory.abstractfactory.responder;

public class JsonResponder implements Responder{

    @Override
    public String getResponse() {
        return "A sample json Response";
    }
}
