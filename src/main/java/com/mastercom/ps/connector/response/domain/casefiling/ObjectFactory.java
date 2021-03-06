//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.04 at 03:02:24 PM CEST 
//


package com.mastercom.ps.connector.response.domain.casefiling;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResponseData_QNAME = new QName("", "ResponseData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CaseFilingResponseData }
     * 
     */
    public CaseFilingResponseData createCaseFilingResponseData() {
        return new CaseFilingResponseData();
    }

    /**
     * Create an instance of {@link CaseFilingResponseList }
     * 
     */
    public CaseFilingResponseList createCaseFilingResponseList() {
        return new CaseFilingResponseList();
    }

    /**
     * Create an instance of {@link CaseID }
     * 
     */
    public CaseID createCaseID() {
        return new CaseID();
    }

    /**
     * Create an instance of {@link FileAttachment }
     * 
     */
    public FileAttachment createFileAttachment() {
        return new FileAttachment();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseFilingResponseData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ResponseData")
    public JAXBElement<CaseFilingResponseData> createResponseData(CaseFilingResponseData value) {
        return new JAXBElement<CaseFilingResponseData>(_ResponseData_QNAME, CaseFilingResponseData.class, null, value);
    }

}
