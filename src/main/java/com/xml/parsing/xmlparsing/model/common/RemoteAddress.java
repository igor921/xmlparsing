package com.xml.parsing.xmlparsing.model.common;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class RemoteAddress {
    @XmlElement
    public AI ai;
    @XmlAttribute
    public int pc;
    @XmlAttribute
    public int ssn;
}
