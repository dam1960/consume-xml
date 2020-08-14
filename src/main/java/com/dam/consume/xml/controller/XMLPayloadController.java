package com.dam.consume.xml.controller;

import com.dam.consume.xml.domain.XMLPayload;
import com.dam.consume.xml.service.XMLPayloadService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XMLPayloadController {

    private final XMLPayloadService xmlPayloadService;

    public XMLPayloadController(XMLPayloadService xmlPayloadService) {
        this.xmlPayloadService = xmlPayloadService;
    }

    @PostMapping("/save")
    public XMLPayload save(@RequestBody String xml) {
        return xmlPayloadService.save(xml);
    }
}
