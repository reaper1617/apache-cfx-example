package com.example.cxf;

import com.example.cxf.service.StudentService;
import com.example.cxf.service.StudentServiceImpl;

import javax.xml.ws.Endpoint;

public class Server {
    public static void main(String[] args) throws InterruptedException {
        StudentService service = new StudentServiceImpl();
        String address =  "http://localhost:8080/student";
        Endpoint.publish(address, service);
        Thread.sleep(120 * 60 * 1000);
        System.exit(0);
    }
}
