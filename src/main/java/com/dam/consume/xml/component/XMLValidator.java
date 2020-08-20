package com.dam.consume.xml.component;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;

@Component
public class XMLValidator {

    public boolean validateXML(String xml) {
        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        try {
            File file = ResourceUtils.getFile("classpath:note.xsd");
            Schema schema = schemaFactory.newSchema(file);
            Validator validator = schema.newValidator();

            StringReader stringReader = new StringReader(xml);
            validator.validate(new StreamSource(stringReader));
            stringReader.close();
        } catch (SAXException | IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
