package org.example.creational.factory.abstractfactory.parser;

public class XmlParser implements ParsingInterface {
    @Override
    public Object parse(String request) {
        System.out.println("parsing Xml request...");
        return null;
    }
}
