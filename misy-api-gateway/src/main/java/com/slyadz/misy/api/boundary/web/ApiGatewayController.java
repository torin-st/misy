package com.slyadz.misy.api.boundary.web;

import com.slyadz.misy.api.application.DepartmentsServiceClient;
import com.slyadz.misy.api.dto.DepartmentDetails;
import com.slyadz.misy.api.dto.DepartmentDetailsList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/gateway")
public class ApiGatewayController {
    private final DepartmentsServiceClient departmentsServiceClient;

    public ApiGatewayController(DepartmentsServiceClient departmentsServiceClient) {
        this.departmentsServiceClient = departmentsServiceClient;
    }

    @GetMapping("departments")
    public DepartmentDetailsList getDepartments(){
        return departmentsServiceClient.getDepartments();
    }

    @GetMapping("departments/{departmentId}")
    public DepartmentDetails getDepartment(@PathVariable Long departmentId){
        return departmentsServiceClient.getDepartment(departmentId);
    }
}
