package com.slyadz.misy.api.dto;

import java.util.Objects;

public class DepartmentDetails {
    private Long id;
    private String name;

    public DepartmentDetails() {
    }

    public DepartmentDetails(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentDetails that = (DepartmentDetails) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "DepartmentDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
