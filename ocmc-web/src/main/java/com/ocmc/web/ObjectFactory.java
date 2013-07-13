
package com.ocmc.web;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import beans.ws.ocmc.com.PriorityCollectionType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ocmc.web package. 
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

    private final static QName _UpdatePriorityResponse_QNAME = new QName("com.ocmc.ws.services", "UpdatePriorityResponse");
    private final static QName _GetAllPrioritiesResponse_QNAME = new QName("com.ocmc.ws.services", "GetAllPrioritiesResponse");
    private final static QName _GetPriority_QNAME = new QName("com.ocmc.ws.services", "GetPriority");
    private final static QName _GetAllPriorities_QNAME = new QName("com.ocmc.ws.services", "GetAllPriorities");
    private final static QName _PriorityCollection_QNAME = new QName("com.ocmc.ws.services", "PriorityCollection");
    private final static QName _UpdatePriority_QNAME = new QName("com.ocmc.ws.services", "UpdatePriority");
    private final static QName _AddPriorityResponse_QNAME = new QName("com.ocmc.ws.services", "AddPriorityResponse");
    private final static QName _AddPriority_QNAME = new QName("com.ocmc.ws.services", "AddPriority");
    private final static QName _GetPriorityResponse_QNAME = new QName("com.ocmc.ws.services", "GetPriorityResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ocmc.web
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddPriority }
     * 
     */
    public AddPriority createAddPriority() {
        return new AddPriority();
    }

    /**
     * Create an instance of {@link UpdatePriority }
     * 
     */
    public UpdatePriority createUpdatePriority() {
        return new UpdatePriority();
    }

    /**
     * Create an instance of {@link AddPriorityResponse }
     * 
     */
    public AddPriorityResponse createAddPriorityResponse() {
        return new AddPriorityResponse();
    }

    /**
     * Create an instance of {@link GetPriorityResponse }
     * 
     */
    public GetPriorityResponse createGetPriorityResponse() {
        return new GetPriorityResponse();
    }

    /**
     * Create an instance of {@link GetAllPrioritiesResponse }
     * 
     */
    public GetAllPrioritiesResponse createGetAllPrioritiesResponse() {
        return new GetAllPrioritiesResponse();
    }

    /**
     * Create an instance of {@link UpdatePriorityResponse }
     * 
     */
    public UpdatePriorityResponse createUpdatePriorityResponse() {
        return new UpdatePriorityResponse();
    }

    /**
     * Create an instance of {@link GetAllPriorities }
     * 
     */
    public GetAllPriorities createGetAllPriorities() {
        return new GetAllPriorities();
    }

    /**
     * Create an instance of {@link GetPriority }
     * 
     */
    public GetPriority createGetPriority() {
        return new GetPriority();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePriorityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.ocmc.ws.services", name = "UpdatePriorityResponse")
    public JAXBElement<UpdatePriorityResponse> createUpdatePriorityResponse(UpdatePriorityResponse value) {
        return new JAXBElement<UpdatePriorityResponse>(_UpdatePriorityResponse_QNAME, UpdatePriorityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPrioritiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.ocmc.ws.services", name = "GetAllPrioritiesResponse")
    public JAXBElement<GetAllPrioritiesResponse> createGetAllPrioritiesResponse(GetAllPrioritiesResponse value) {
        return new JAXBElement<GetAllPrioritiesResponse>(_GetAllPrioritiesResponse_QNAME, GetAllPrioritiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPriority }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.ocmc.ws.services", name = "GetPriority")
    public JAXBElement<GetPriority> createGetPriority(GetPriority value) {
        return new JAXBElement<GetPriority>(_GetPriority_QNAME, GetPriority.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPriorities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.ocmc.ws.services", name = "GetAllPriorities")
    public JAXBElement<GetAllPriorities> createGetAllPriorities(GetAllPriorities value) {
        return new JAXBElement<GetAllPriorities>(_GetAllPriorities_QNAME, GetAllPriorities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriorityCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.ocmc.ws.services", name = "PriorityCollection")
    public JAXBElement<PriorityCollectionType> createPriorityCollection(PriorityCollectionType value) {
        return new JAXBElement<PriorityCollectionType>(_PriorityCollection_QNAME, PriorityCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePriority }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.ocmc.ws.services", name = "UpdatePriority")
    public JAXBElement<UpdatePriority> createUpdatePriority(UpdatePriority value) {
        return new JAXBElement<UpdatePriority>(_UpdatePriority_QNAME, UpdatePriority.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPriorityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.ocmc.ws.services", name = "AddPriorityResponse")
    public JAXBElement<AddPriorityResponse> createAddPriorityResponse(AddPriorityResponse value) {
        return new JAXBElement<AddPriorityResponse>(_AddPriorityResponse_QNAME, AddPriorityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPriority }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.ocmc.ws.services", name = "AddPriority")
    public JAXBElement<AddPriority> createAddPriority(AddPriority value) {
        return new JAXBElement<AddPriority>(_AddPriority_QNAME, AddPriority.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPriorityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.ocmc.ws.services", name = "GetPriorityResponse")
    public JAXBElement<GetPriorityResponse> createGetPriorityResponse(GetPriorityResponse value) {
        return new JAXBElement<GetPriorityResponse>(_GetPriorityResponse_QNAME, GetPriorityResponse.class, null, value);
    }

}
