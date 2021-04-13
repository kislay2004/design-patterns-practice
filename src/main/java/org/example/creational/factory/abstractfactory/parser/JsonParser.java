package org.example.creational.factory.abstractfactory.parser;

public class JsonParser implements ParsingInterface {

    @Override
    public Object parse(String request) {
        System.out.println("parsing Json request...");
        return null;
    }
}
