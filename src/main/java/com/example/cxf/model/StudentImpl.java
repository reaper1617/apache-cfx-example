package com.example.cxf.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "student")
public class StudentImpl implements Student {

    private String name;

    public StudentImpl(){
        name = "default";
    }

    public StudentImpl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
