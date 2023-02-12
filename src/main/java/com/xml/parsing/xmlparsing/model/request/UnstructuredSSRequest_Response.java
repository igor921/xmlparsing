package com.xml.parsing.xmlparsing.model.request;

import javax.xml.bind.annotation.XmlAttribute;

public class UnstructuredSSRequest_Response {
    @XmlAttribute
    public int invokeId;
    @XmlAttribute
    public int dataCodingScheme;
    @XmlAttribute
    public String string;
}
