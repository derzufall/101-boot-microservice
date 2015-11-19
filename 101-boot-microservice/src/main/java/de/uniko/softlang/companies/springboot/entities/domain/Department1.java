/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.uniko.softlang.companies.springboot.entities.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import de.uniko.softlang.companies.springboot.absgeneric.AbstractEntity;
import de.uniko.softlang.companies.springboot.services.Employee1Repository;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.stereotype.Component;
/**
 *
 * @author nbreest
 */
@Entity
public class Department1 extends AbstractEntity implements Serializable {
    
    @NotNull
    @Size(min = 1, max = 255)
    @Column(unique=true, nullable = false)
    private String name;
    
    @Basic(optional = false)
    @ManyToOne
    private Company1 company;
    
    @Transient
    private Employee1 managedBy;
    
    @ManyToOne
    private Department1 subdepartmentOf;
    
    @Basic(optional = true)
    @OneToMany(mappedBy = "subdepartmentOf", orphanRemoval = true,cascade = CascadeType.ALL)
    private List<Department1> departments;
    
    @Basic(optional = true)
    @OneToMany(mappedBy = "department", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Employee1> employees;
    
    @Inject
    private Employee1Repository repo;
    
    
    public Company1 getCompany() {
        return company;
    }

    public void setCompany(Company1 company) {
        this.company = company;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee1> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee1> employees) {
        this.employees = employees;
    }

    public Employee1 getManagedBy() {
        return managedBy;
    }

    public void setManagedBy(Employee1 managedBy) {
        this.managedBy = managedBy;
    }   
    
    public Department1 getSubdepartmentOf() {
        return subdepartmentOf;
    }

    public void setSubdepartmentOf(Department1 subdepartmentOf) {
        this.subdepartmentOf = subdepartmentOf;
    }

    public List<Department1> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department1> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Department1{" + "name=" + name + ", company=" + company + ", managedBy=" + managedBy + ", subdepartmentOf=" + subdepartmentOf + ", departments=" + departments + ", employees=" + employees + '}';
    }

    
    
    
}