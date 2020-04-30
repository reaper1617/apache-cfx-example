package com.example.cxf.model;

import com.example.cxf.adapter.StudentAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(StudentAdapter.class)
public interface Student {
    String getName();
}
