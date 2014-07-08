/**
 * SISLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;

public class SISLocator extends org.apache.axis.client.Service implements com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.SIS {

    public SISLocator() {
    }


    public SISLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SISLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_ICWSServiceInformation
    private java.lang.String BasicHttpBinding_ICWSServiceInformation_address = "https://nab-den-l05.nabcommerce.com:4433/2.0.19/SOAP/SIS.svc";

    public java.lang.String getBasicHttpBinding_ICWSServiceInformationAddress() {
        return BasicHttpBinding_ICWSServiceInformation_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_ICWSServiceInformationWSDDServiceName = "BasicHttpBinding_ICWSServiceInformation";

    public java.lang.String getBasicHttpBinding_ICWSServiceInformationWSDDServiceName() {
        return BasicHttpBinding_ICWSServiceInformationWSDDServiceName;
    }

    public void setBasicHttpBinding_ICWSServiceInformationWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_ICWSServiceInformationWSDDServiceName = name;
    }

    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ICWSServiceInformation getBasicHttpBinding_ICWSServiceInformation() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_ICWSServiceInformation_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_ICWSServiceInformation(endpoint);
    }

    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ICWSServiceInformation getBasicHttpBinding_ICWSServiceInformation(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BasicHttpBinding_ICWSServiceInformationStub _stub = new com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BasicHttpBinding_ICWSServiceInformationStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_ICWSServiceInformationWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_ICWSServiceInformationEndpointAddress(java.lang.String address) {
        BasicHttpBinding_ICWSServiceInformation_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ICWSServiceInformation.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BasicHttpBinding_ICWSServiceInformationStub _stub = new com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BasicHttpBinding_ICWSServiceInformationStub(new java.net.URL(BasicHttpBinding_ICWSServiceInformation_address), this);
                _stub.setPortName(getBasicHttpBinding_ICWSServiceInformationWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_ICWSServiceInformation".equals(inputPortName)) {
            return getBasicHttpBinding_ICWSServiceInformation();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "SIS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "BasicHttpBinding_ICWSServiceInformation"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_ICWSServiceInformation".equals(portName)) {
            setBasicHttpBinding_ICWSServiceInformationEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
