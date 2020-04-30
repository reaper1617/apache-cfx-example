package com.example.cxf.adapter;

import com.example.cxf.model.Student;
import com.example.cxf.model.StudentImpl;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class StudentAdapter extends XmlAdapter<StudentImpl, Student> {

    public Student unmarshal(StudentImpl student) throws Exception {
        return student;
    }

    public StudentImpl marshal(Student student) throws Exception {
        if (student instanceof StudentImpl){
            return (StudentImpl)student;
        }
        return new StudentImpl(student.getName());
    }
}
