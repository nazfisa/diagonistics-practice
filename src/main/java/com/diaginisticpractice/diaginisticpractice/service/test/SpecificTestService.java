package com.diaginisticpractice.diaginisticpractice.service.test;

import com.diaginisticpractice.diaginisticpractice.entity.SpecificTest;

import java.util.List;

public interface SpecificTestService {
    public List<SpecificTest> findAll();
    public SpecificTest findById(int id);
    public void save(SpecificTest testType);
    public void deleteById(int theId);
}
