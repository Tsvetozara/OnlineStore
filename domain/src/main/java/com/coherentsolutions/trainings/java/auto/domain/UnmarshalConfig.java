package com.coherentsolutions.trainings.java.auto.domain;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnmarshalConfig {

    public Config jaxbXmlFileToObject(String fileName) throws JAXBException {

        JAXBContext jaxbContext;

        try {
            jaxbContext = JAXBContext.newInstance(Config.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Config results = (Config) jaxbUnmarshaller.unmarshal(UnmarshalConfig.class.getResourceAsStream("/" + fileName));
            return  results;

        } catch (JAXBException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
