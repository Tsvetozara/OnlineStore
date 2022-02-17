package com.coherentsolutions.trainings.java.auto.domain;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class ConfigReader {


    public List<String> readOrder() {
        List<String> result = new LinkedList<>();
        try (InputStream is = ConfigReader.class.getResourceAsStream("config.xml")) {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader reader = xmlInputFactory.createXMLEventReader(is);

            while (reader.hasNext()) {
                XMLEvent nextEvent = reader.nextEvent();
                if (nextEvent.isStartElement()) {
                    StartElement startElement = nextEvent.asStartElement();
                    if (!startElement.getName().getLocalPart().equals("sort")) {
                        result.add(startElement.getName().getLocalPart());
                    }
                }
            }
            return result;
        } catch (IOException | XMLStreamException e) {
            throw new RuntimeException("Failed to read config file");
        }
    }
}
