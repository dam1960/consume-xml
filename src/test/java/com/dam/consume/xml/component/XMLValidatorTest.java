package com.dam.consume.xml.component;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class XMLValidatorTest {

    private XMLValidator xmlValidator;

    @BeforeEach
    void setUp() {
        xmlValidator = new XMLValidator();
    }

    @Test
    public void validateXML() {
        boolean isXMLValid = xmlValidator.validateXML("<xml>some xml<xml>");
        assertTrue(isXMLValid);
    }
}