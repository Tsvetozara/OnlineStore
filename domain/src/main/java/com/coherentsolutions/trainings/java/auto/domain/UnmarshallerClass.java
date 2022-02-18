package com.coherentsolutions.trainings.java.auto.domain;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnmarshallerClass {

    private static void jaxbXmlFileToObject(String fileName) {

        File xmlFile = new File("config.xml");

        JAXBContext jaxbContext;

        try
        {
            jaxbContext = JAXBContext.newInstance(UnmarshallerClass.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            UnmarshallerClass results = (UnmarshallerClass) jaxbUnmarshaller.unmarshal(xmlFile);

            System.out.println(results);
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }
}
