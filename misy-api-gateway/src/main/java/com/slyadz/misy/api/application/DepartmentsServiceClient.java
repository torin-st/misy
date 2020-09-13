package com.slyadz.misy.api.application;

import com.slyadz.misy.api.dto.DepartmentDetails;
import com.slyadz.misy.api.dto.DepartmentDetailsList;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DepartmentsServiceClient {

    private final RestTemplate loadBalancedRestTemplate;

    public DepartmentsServiceClient(RestTemplate loadBalancedRestTemplate) {
        this.loadBalancedRestTemplate = loadBalancedRestTemplate;
    }

    public DepartmentDetailsList getDepartments(){
        return loadBalancedRestTemplate.getForObject("http://departments-service/departments", DepartmentDetailsList.class);
    }

    public DepartmentDetails getDepartment(Long departmentId){
        return loadBalancedRestTemplate.getForObject("http://departments-service/departments/{departmentId}", DepartmentDetails.class, departmentId);
    }
}
