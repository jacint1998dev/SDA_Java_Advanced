package com.sda.denisbalaceanu.designpatterns.behaviour.visitor.example2;

import java.util.UUID;

public class Main
{
    public static void main(String[] args) {

        Visitor visitor = new ElementVisitor();

        Document document = new Document(generateUuid());
        document.elements.add(new JsonElement(generateUuid()));
        document.elements.add(new JsonElement(generateUuid()));
        document.elements.add(new XmlElement(generateUuid()));

        document.accept(visitor);
    }

    private static String generateUuid() {
        return UUID.randomUUID().toString();
    }
}
