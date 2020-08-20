package com.dam.consume.xml.controller;

import com.dam.consume.xml.domain.XMLPayload;
import com.dam.consume.xml.service.XMLPayloadService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class XMLPayloadController {

    private HttpServletRequest servletRequest;
    private final XMLPayloadService xmlPayloadService;

    public XMLPayloadController(XMLPayloadService xmlPayloadService) {
        this.xmlPayloadService = xmlPayloadService;
    }

    @PostMapping("/save")
    public XMLPayload save(@RequestHeader String token,  @RequestBody String xml) {
        return xmlPayloadService.save(xml);
    }
}
