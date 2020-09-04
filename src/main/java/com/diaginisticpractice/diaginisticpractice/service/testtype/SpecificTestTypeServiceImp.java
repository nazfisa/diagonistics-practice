package com.diaginisticpractice.diaginisticpractice.service.testtype;


import com.diaginisticpractice.diaginisticpractice.dao.SpecificTestTypeRepository;
import com.diaginisticpractice.diaginisticpractice.entity.SpecificTestType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecificTestTypeServiceImp implements SpecificTestTypeService {
    @Autowired
   private SpecificTestTypeRepository testTypeRepository;

    @Override
    public List<SpecificTestType> findAll() {
        return testTypeRepository.findAllByOrderByNameAsc();
    }

    @Override
    public SpecificTestType findById(int id) {
        Optional<SpecificTestType> result = testTypeRepository.findById(id);
        SpecificTestType testType = null;
        if(result.isPresent()){
            testType = result.get();
        }else {
            throw new RuntimeException("Did not find Test");
        }
        return testType;
    }

    @Override
    public void save(SpecificTestType testType) {
        testTypeRepository.save(testType);
    }

    @Override
    public void deleteById(int theId) {

    }
}
