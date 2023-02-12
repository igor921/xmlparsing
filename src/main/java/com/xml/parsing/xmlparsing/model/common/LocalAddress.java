package com.xml.parsing.xmlparsing.model.common;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LocalAddress {
    @XmlElement
    public AI ai;
    @XmlAttribute
    public int pc;
    @XmlAttribute
    public int ssn;
}
