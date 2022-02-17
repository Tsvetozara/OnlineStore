package com.coherentsolutions.trainings.java.auto.domain;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ConfigReader {
    
    public void readOrder() throws JAXBException {
        List<String> result = new LinkedList<>();

        JAXBContext jaxbContext = JAXBContext.newInstance(ConfigReader.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        ConfigReader results = (ConfigReader) jaxbUnmarshaller.unmarshal(new File("config.xml"));
    }
}