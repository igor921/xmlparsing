package com.xml.parsing.xmlparsing.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.xml.parsing.xmlparsing.model.request.Dialog;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.*;

@Service
public class XMLParsingService {

    private final ObjectMapper xmlMapper;

    public XMLParsingService() {
         xmlMapper = new XmlMapper();
    }

    public String parseSecond(String xml) throws IOException, JAXBException {
        //Parsed xml to pojo
        Dialog dialog = parseXML(xml, Dialog.class);

        //TODO GET FILE FROM RESOURCES
        //Load xml from resources
        File file = ResourceUtils.getFile("classpath:4.xml");
        InputStream in = new FileInputStream(file);
        Dialog dialogResponse = parseXML(in, Dialog.class);

        return parseObjectToXML(dialogResponse);
    }


    private <T> T parseXML(String input, Class cl) throws IOException {
        T value = (T)xmlMapper.readValue(input, cl);
        return value;
    }

    private <T> T parseXML(InputStream input, Class cl) throws IOException {
        T value = (T)xmlMapper.readValue(input, cl);
        return value;
    }

    private String parseObjectToXML(Dialog dialog) throws JAXBException {
        Marshaller marshaller = createMarshaller(Dialog.class);
        StringWriter xml = new StringWriter();
        marshaller.marshal(dialog, xml);
        return xml.toString();
    }

    private Marshaller createMarshaller(Class objectClass) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(objectClass);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        return marshaller;
    }

}
