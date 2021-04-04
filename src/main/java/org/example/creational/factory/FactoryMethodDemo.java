package org.example.creational.factory;

//a.k.a. simple factory.
public class FactoryMethodDemo {
    public static void main(String[] args) {
        // This is an example - showcasing without factory
        ParserClient parserClient = new ParserClient();
        parserClient.parseBook();

        // This is an example - showcasing client using factory method
        ParserClientUsingFactory parserClientUsingFactory = new ParserClientUsingFactory();
        parserClientUsingFactory.parseBook();
    }
}

class Parser {

    String typeOfParser;

    public Parser(String typeOfParser) {
        this.typeOfParser = typeOfParser;
    }

    public static Parser createNewParserInstance() {
        return new Parser("Stringify");
    }

    public String parse(Object obj) {
        System.out.println("I do the parsing using type:" + typeOfParser);
        return obj.toString();
    }
}


class ParserClient {
    public void parseBook() {
        Parser parser = new Parser("StringParser");// creating object using new operator. tightly coupled
        Book book = new Book("Harry Potter - 1");
        System.out.println(parser.parse(book));
    }
}


class ParserClientUsingFactory {
    public void parseBook() {
        //creating object using factory, Now this abstracts away the creation part.
        Parser parser = Parser.createNewParserInstance();  // static factory method - good or bad?
        Book book = new Book("Harry Potter - 2");
        System.out.println(parser.parse(book));

        //Now, assuming we got a change in parser at this point, say parser needs to have a config item.

        //we can see that, we did not require to change anything in this client
        // ..however the client that was using new operator, did require a change!

    }
}
/* Note 1]: static factory does not allow inheritance.
   But useful, lets say we need to have the same signature and want two different instances semantically.
   createRadioButton(int minValue) and createRadioButton(int maxValue)

  * Note2]: What are the advantages? Loos coupling for one.

*/


