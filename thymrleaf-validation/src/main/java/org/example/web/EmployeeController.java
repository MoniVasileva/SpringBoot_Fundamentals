package org.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    @GetMapping("/add")
    public String getAddPage(){
        return "employee-add";
    }
    @GetMapping("/all")
    public String getAllCompanyPages(){
        return "employee-all";
    }
}
