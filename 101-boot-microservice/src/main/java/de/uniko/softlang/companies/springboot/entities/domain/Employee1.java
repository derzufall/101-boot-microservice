/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.uniko.softlang.companies.springboot.entities.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import de.uniko.softlang.companies.springboot.absgeneric.AbstractEntity;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/**
 *
 * @author nbreest
 */
@Table(
    uniqueConstraints=
        @UniqueConstraint(columnNames={"name", "company_id"})
)
@Entity
public class Employee1 extends AbstractEntity implements Serializable {
    
    @ManyToOne(optional = false)
    @NotNull
    private Company1 company;
    
    @ManyToOne(optional = false)
    @NotNull
    private Department1 department;
    
    @Size(min = 1, max = 255)
    @NotNull
    @Column(nullable = false)
    private String name;
    
    @OneToMany//(mappedBy = "managedBy")
    private Set<Department1> manages;

   
    
    
       
    
    public Company1 getCompany() {
        return company;
    }

    public void setCompany(Company1 company) {
        this.company = company;
    }

    public Department1 getDepartment() {
        return department;
    }

    public void setDepartment(Department1 department) {
        this.department = department;
    }

    public Set<Department1> getManages() {
        return manages;
    }
    
    public void setManages(Set<Department1> manages) {
        this.manages.stream().forEach((dep) -> {
            dep.setManagedBy(null);
        });
        manages.stream().forEach((dep) -> {
            dep.setManagedBy(this);
        });
        //manages.toString();
        this.manages = manages;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    

}