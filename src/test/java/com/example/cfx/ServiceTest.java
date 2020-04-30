package com.example.cfx;

import com.example.cxf.service.StudentService;
import com.example.cxf.service.StudentServiceImpl;
import org.apache.cxf.binding.soap.wsdl.extensions.SoapBinding;
import org.junit.jupiter.api.Test;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;


public class ServiceTest {


    private static QName SERVICE_NAME = new QName("http://introduction.cxf.com/", "Service");
    private static QName PORT_NAME = new QName("http://introduction.cxf.com/", "Port");


    private Service service;
    private StudentService serviceProxy;
    private StudentServiceImpl serviceImpl;


    @Test
    public void run(){
        service = Service.create(SERVICE_NAME);
        String address = "http://localhost:8080/student";
        service.addPort(PORT_NAME, SOAPBinding.SOAP11HTTP_BINDING, address);
        serviceImpl = new StudentServiceImpl();
        serviceProxy = service.getPort(PORT_NAME, StudentService.class);

        String endpointResponse = serviceProxy.hello("Service");
        String localResponse = serviceImpl.hello("Service");
        System.out.println(endpointResponse.equals(localResponse));
    }

}
