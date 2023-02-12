package com.xml.parsing.xmlparsing.model.response;

import javax.xml.bind.annotation.XmlAttribute;

public class ProcessUnstructuredSSRequest_Response {
    @XmlAttribute
    public int invokeId;
    @XmlAttribute
    public int dataCodingScheme;
    @XmlAttribute
    public String string;
}
