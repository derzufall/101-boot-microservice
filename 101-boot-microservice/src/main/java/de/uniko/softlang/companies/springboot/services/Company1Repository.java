/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.uniko.softlang.companies.springboot.services;

import de.uniko.softlang.companies.springboot.entities.domain.Company1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author nbreest
 */
@RepositoryRestResource(collectionResourceRel = "companies", path = "companies")
public interface Company1Repository extends JpaRepository<Company1, Long> {
    
}
