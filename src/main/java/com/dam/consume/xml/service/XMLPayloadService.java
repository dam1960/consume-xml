package com.dam.consume.xml.service;

import com.dam.consume.xml.domain.XMLPayload;
import com.dam.consume.xml.repository.XMLPayloadRepository;
import org.springframework.stereotype.Service;

@Service
public class XMLPayloadService {

    private final XMLPayloadRepository xmlPayloadRepository;

    public XMLPayloadService(XMLPayloadRepository xmlPayloadRepository) {
        this.xmlPayloadRepository = xmlPayloadRepository;
    }

    public XMLPayload save(String xml) {
        XMLPayload xmlPayload = new XMLPayload();
        xmlPayload.setXml(xml);

        return xmlPayloadRepository.save(xmlPayload);
    }
}
