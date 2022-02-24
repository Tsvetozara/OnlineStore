package com.coherentsolutions.trainings.java.auto.domain;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnmarshallerClass {

    public void jaxbXmlFileToObject(String fileName) {

        JAXBContext jaxbContext;

        try
        {
            jaxbContext = JAXBContext.newInstance(Config.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            Config results = (Config) jaxbUnmarshaller.unmarshal(UnmarshallerClass.class.getResourceAsStream("/" + fileName));

            System.out.println(results.getTop());
            System.out.println(results.getSort().getName());
            System.out.println(results.getSort().getPrice());
            System.out.println(results.getSort().getRate());
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }
}
