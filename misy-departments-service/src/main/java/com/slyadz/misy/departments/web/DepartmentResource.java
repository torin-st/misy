package com.slyadz.misy.departments.web;

import com.slyadz.misy.departments.model.Department;
import com.slyadz.misy.departments.model.DepartmentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/departments")
@RestController
public class DepartmentResource {

    private final DepartmentRepository departmentRepository;

    public DepartmentResource(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @GetMapping
    public List<Department> findAll (){
        return departmentRepository.findAll();
    }
}
