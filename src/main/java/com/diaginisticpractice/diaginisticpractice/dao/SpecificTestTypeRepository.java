package com.diaginisticpractice.diaginisticpractice.dao;

import com.diaginisticpractice.diaginisticpractice.entity.SpecificTestType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SpecificTestTypeRepository extends JpaRepository<SpecificTestType, Integer> {
    public List<SpecificTestType> findAllByOrderByNameAsc();
}
