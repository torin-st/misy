package com.slyadz.misy.departments.web;

import com.slyadz.misy.departments.model.Department;
import com.slyadz.misy.departments.model.DepartmentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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

    @GetMapping(value = "/{departmentId}")
    public Optional<Department> findDepartment(@PathVariable("departmentId") Long departmentId){
        return departmentRepository.findById(departmentId);
    }
}
