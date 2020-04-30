package com.example.cxf.adapter;

import com.example.cxf.model.Student;
import com.example.cxf.model.StudentMap;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.HashMap;
import java.util.Map;

public class StudentsMapAdapter extends XmlAdapter<StudentMap, Map<Integer, Student>> {

    @Override
    public Map<Integer, Student> unmarshal(StudentMap studentMap) throws Exception {
        Map<Integer, Student> result = new HashMap<>();
        studentMap.getEntries().forEach(e -> result.put(e.getId(), e.getStudent()));
        return result;
    }

    @Override
    public StudentMap marshal(Map<Integer, Student> integerStudentMap) throws Exception {
        StudentMap result = new StudentMap();
        integerStudentMap.forEach( (k,v) -> result.getEntries().add(new StudentMap.StudentEntry(k,v)));
        return result;
    }
}
