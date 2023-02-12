package com.xml.parsing.xmlparsing.controller;

import com.xml.parsing.xmlparsing.service.XMLParsingService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.JAXBException;
import java.io.IOException;

@RestController
@RequestMapping("/api/xml")
public class XMLParsingRestController {

    private final XMLParsingService xmlParsingService;

    public XMLParsingRestController(XMLParsingService xmlParsingService) {
        this.xmlParsingService = xmlParsingService;
    }

    @PostMapping("/httpgw")
    public ResponseEntity<String> handleFileUpload(@RequestBody String xmlContent) throws IOException, JAXBException {
    String response = xmlParsingService.parseSecond(xmlContent);
        return ResponseEntity.ok()
                .contentType(MediaType.TEXT_XML)
                .body(response);

    }
}
