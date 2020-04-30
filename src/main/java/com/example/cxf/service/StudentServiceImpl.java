package com.example.cxf.service;

import com.example.cxf.adapter.StudentsMapAdapter;
import com.example.cxf.model.Student;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@WebService(endpointInterface = "com.example.cxf.service.StudentService")
public class StudentServiceImpl implements StudentService {

    private static final Map<Integer, Student> students = new ConcurrentHashMap<>();

    public String hello(String name) {
        return "Hello " + name;
    }

    public String helloStudent(Student student) {
        students.put(students.size()+1, student);
        return "Hello " + student.getName();
    }

    @XmlJavaTypeAdapter(StudentsMapAdapter.class)
    public Map<Integer, Student> getStudents() {
        return students;
    }
}
