package com.xml.parsing.xmlparsing.model.common;

import javax.xml.bind.annotation.XmlAttribute;

public class OriginationReference {
    @XmlAttribute
    public int number;
    @XmlAttribute
    public String nai;
    @XmlAttribute
    public String npi;
}
