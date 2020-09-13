package com.slyadz.misy.api.dto;

import java.util.ArrayList;
import java.util.List;

public class DepartmentDetailsList {
    private List<DepartmentDetails> departments;

    public DepartmentDetailsList() {
        departments = new ArrayList<>();
    }

    public List<DepartmentDetails> getDepartments() {
        return departments;
    }

    public void setDepartments(List<DepartmentDetails> departments) {
        this.departments = departments;
    }
}
