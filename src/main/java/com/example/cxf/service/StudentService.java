package com.example.cxf.service;

import com.example.cxf.adapter.StudentsMapAdapter;
import com.example.cxf.model.Student;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Map;

@WebService
public interface StudentService {

    String hello(String name);
    String helloStudent(Student student);

    @XmlJavaTypeAdapter(StudentsMapAdapter.class)
    Map<Integer, Student> getStudents();


}
