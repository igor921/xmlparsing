package com.xml.parsing.xmlparsing.model.common;

import javax.xml.bind.annotation.XmlAttribute;

public class DestinationReference {
    @XmlAttribute
    public int number;
    @XmlAttribute
    public String nai;
    @XmlAttribute
    public String npi;
}
