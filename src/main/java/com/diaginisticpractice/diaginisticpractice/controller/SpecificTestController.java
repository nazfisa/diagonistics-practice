package com.diaginisticpractice.diaginisticpractice.controller;

import com.diaginisticpractice.diaginisticpractice.entity.SpecificTest;
import com.diaginisticpractice.diaginisticpractice.entity.SpecificTestType;
import com.diaginisticpractice.diaginisticpractice.service.test.SpecificTestService;
import com.diaginisticpractice.diaginisticpractice.service.testtype.SpecificTestTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/tests")
public class SpecificTestController {
    @Autowired
    private SpecificTestService testService;
    @Autowired
    private SpecificTestTypeService testTypeService;
    @GetMapping("/list")
    public String listEmployees(Model model) {

        List<SpecificTest> tests = testService.findAll();
        model.addAttribute("tests", tests);

        return "test/list-tests";
    }
    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {

        SpecificTest test = new SpecificTest();

        model.addAttribute("test", test);

        List<SpecificTestType> testTypeList = testTypeService.findAll();

        model.addAttribute("testtypes", testTypeList);

        return "test/test-form";
    }
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("test") SpecificTest test) {

        // save the employee
        testService.save(test);

        // use a redirect to prevent duplicate submissions
        return "redirect:/tests/list";

    }
}
