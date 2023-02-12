package com.xml.parsing.xmlparsing.model.request;

import com.xml.parsing.xmlparsing.model.common.DestinationReference;
import com.xml.parsing.xmlparsing.model.common.LocalAddress;
import com.xml.parsing.xmlparsing.model.common.OriginationReference;
import com.xml.parsing.xmlparsing.model.common.RemoteAddress;
import com.xml.parsing.xmlparsing.model.response.ProcessUnstructuredSSRequest_Response;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "dialog")
@XmlAccessorType(XmlAccessType.NONE)
public class Dialog {

    @XmlAttribute
    public String type;

    @XmlAttribute
    public String appCntx;
    @XmlAttribute
    public int networkId;
    @XmlAttribute
    public int localId;
    @XmlAttribute
    public int remoteId;
    @XmlAttribute
    public int mapMessagesSize;
    @XmlAttribute
    public boolean returnMessageOnError;
    @XmlAttribute
    public boolean prearrangedEnd;
    @XmlAttribute
    public String userObject;

    @XmlElement
    public LocalAddress localAddress;
    @XmlElement
    public RemoteAddress remoteAddress;
    @XmlElement
    public DestinationReference destinationReference;
    @XmlElement
    public OriginationReference originationReference;
    @XmlElement
    public UnstructuredSSRequest_Response unstructuredSSRequest_Response;
    @XmlElement
    public ProcessUnstructuredSSRequest_Response processUnstructuredSSRequest_Response;
}
