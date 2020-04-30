package com.example.cxf.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlType(name = "StudentMap")
public class StudentMap {


    private List<StudentEntry> entries = new ArrayList<>();

    @XmlElement(nillable = false, name = "entry")
    public List<StudentEntry> getEntries() {
        return entries;
    }

    @XmlType(name = "StudentEntry")
    public static class StudentEntry{
        private Integer id;
        private Student student;

        public StudentEntry(){
            id = 0;
            student = null;
        }

        public StudentEntry(Integer id, Student student) {
            this.id = id;
            this.student = student;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Student getStudent() {
            return student;
        }

        public void setStudent(Student student) {
            this.student = student;
        }
    }
}
