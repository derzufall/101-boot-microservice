/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.uniko.softlang.companies.springboot.entities.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import de.uniko.softlang.companies.springboot.absgeneric.AbstractEntity;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/**
 *
 * @author nbreest
 */

@Entity
public class Company1 extends AbstractEntity implements Serializable {
    
    @Size(min = 1, max = 255)
    @Basic(optional = false)
    @NotNull
    @Column(unique=true, nullable = false)
    private String name;
      
    // sadly with SpringDataRest you cannot interact so well with the owned side of an assoc. (yet)
    @OneToMany(mappedBy = "company", orphanRemoval = true,cascade = CascadeType.ALL)
    private List<Department1> departments;
    
    // sadly with SpringDataRest you cannot interact so well with the owned side of an assoc. (yet)
    @OneToMany(mappedBy = "company")
    private List<Employee1> employees;

    
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department1> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department1> departments) {
        this.departments = departments;
    }

    public List<Employee1> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee1> employees) {
        this.employees = employees;
    }
  
}