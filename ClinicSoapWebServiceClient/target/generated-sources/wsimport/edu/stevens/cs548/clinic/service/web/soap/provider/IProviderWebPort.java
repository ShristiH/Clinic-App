
package edu.stevens.cs548.clinic.service.web.soap.provider;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IProviderWebPort", targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IProviderWebPort {


    /**
     * 
     * @param arg0
     * @return
     *     returns edu.stevens.cs548.clinic.service.web.soap.provider.ProviderDto
     * @throws ProviderServiceExn_Exception
     */
    @WebMethod
    @WebResult(name = "provider-dto", targetNamespace = "http://cs548.stevens.edu/clinic/dto")
    @RequestWrapper(localName = "getProviderByProId", targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap", className = "edu.stevens.cs548.clinic.service.web.soap.provider.GetProviderByProId")
    @ResponseWrapper(localName = "getProviderByProIdResponse", targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap", className = "edu.stevens.cs548.clinic.service.web.soap.provider.GetProviderByProIdResponse")
    @Action(input = "http://cs548.stevens.edu/clinic/service/web/soap/IProviderWebPort/getProviderByProIdRequest", output = "http://cs548.stevens.edu/clinic/service/web/soap/IProviderWebPort/getProviderByProIdResponse", fault = {
        @FaultAction(className = ProviderServiceExn_Exception.class, value = "http://cs548.stevens.edu/clinic/service/web/soap/IProviderWebPort/getProviderByProId/Fault/ProviderServiceExn")
    })
    public ProviderDto getProviderByProId(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0)
        throws ProviderServiceExn_Exception
    ;

    /**
     * 
     * @param treatmentDto
     * @return
     *     returns long
     * @throws ProviderServiceExn_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "providerAddTreatment", targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap", className = "edu.stevens.cs548.clinic.service.web.soap.provider.ProviderAddTreatment")
    @ResponseWrapper(localName = "providerAddTreatmentResponse", targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap", className = "edu.stevens.cs548.clinic.service.web.soap.provider.ProviderAddTreatmentResponse")
    @Action(input = "http://cs548.stevens.edu/clinic/service/web/soap/IProviderWebPort/providerAddTreatmentRequest", output = "http://cs548.stevens.edu/clinic/service/web/soap/IProviderWebPort/providerAddTreatmentResponse", fault = {
        @FaultAction(className = ProviderServiceExn_Exception.class, value = "http://cs548.stevens.edu/clinic/service/web/soap/IProviderWebPort/providerAddTreatment/Fault/ProviderServiceExn")
    })
    public long providerAddTreatment(
        @WebParam(name = "treatment-dto", targetNamespace = "http://cs548.stevens.edu/clinic/dto")
        TreatmentDto treatmentDto)
        throws ProviderServiceExn_Exception
    ;

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "siteInfo", targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap", className = "edu.stevens.cs548.clinic.service.web.soap.provider.SiteInfo")
    @ResponseWrapper(localName = "siteInfoResponse", targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap", className = "edu.stevens.cs548.clinic.service.web.soap.provider.SiteInfoResponse")
    @Action(input = "http://cs548.stevens.edu/clinic/service/web/soap/IProviderWebPort/siteInfoRequest", output = "http://cs548.stevens.edu/clinic/service/web/soap/IProviderWebPort/siteInfoResponse")
    public String siteInfo();

    /**
     * 
     * @param providerDto
     * @return
     *     returns long
     * @throws ProviderServiceExn_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addProvider", targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap", className = "edu.stevens.cs548.clinic.service.web.soap.provider.AddProvider")
    @ResponseWrapper(localName = "addProviderResponse", targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap", className = "edu.stevens.cs548.clinic.service.web.soap.provider.AddProviderResponse")
    @Action(input = "http://cs548.stevens.edu/clinic/service/web/soap/IProviderWebPort/addProviderRequest", output = "http://cs548.stevens.edu/clinic/service/web/soap/IProviderWebPort/addProviderResponse", fault = {
        @FaultAction(className = ProviderServiceExn_Exception.class, value = "http://cs548.stevens.edu/clinic/service/web/soap/IProviderWebPort/addProvider/Fault/ProviderServiceExn")
    })
    public long addProvider(
        @WebParam(name = "provider-dto", targetNamespace = "http://cs548.stevens.edu/clinic/dto")
        ProviderDto providerDto)
        throws ProviderServiceExn_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns edu.stevens.cs548.clinic.service.web.soap.provider.ProviderDto
     * @throws ProviderServiceExn_Exception
     */
    @WebMethod
    @WebResult(name = "provider-dto", targetNamespace = "http://cs548.stevens.edu/clinic/dto")
    @RequestWrapper(localName = "getProvider", targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap", className = "edu.stevens.cs548.clinic.service.web.soap.provider.GetProvider")
    @ResponseWrapper(localName = "getProviderResponse", targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap", className = "edu.stevens.cs548.clinic.service.web.soap.provider.GetProviderResponse")
    @Action(input = "http://cs548.stevens.edu/clinic/service/web/soap/IProviderWebPort/getProviderRequest", output = "http://cs548.stevens.edu/clinic/service/web/soap/IProviderWebPort/getProviderResponse", fault = {
        @FaultAction(className = ProviderServiceExn_Exception.class, value = "http://cs548.stevens.edu/clinic/service/web/soap/IProviderWebPort/getProvider/Fault/ProviderServiceExn")
    })
    public ProviderDto getProvider(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0)
        throws ProviderServiceExn_Exception
    ;

}
