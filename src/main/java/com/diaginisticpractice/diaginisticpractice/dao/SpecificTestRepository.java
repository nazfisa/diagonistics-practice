package com.diaginisticpractice.diaginisticpractice.dao;

import com.diaginisticpractice.diaginisticpractice.entity.SpecificTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpecificTestRepository extends JpaRepository<SpecificTest, Integer> {
    public List<SpecificTest> findAllByOrderByNameAsc();
}
