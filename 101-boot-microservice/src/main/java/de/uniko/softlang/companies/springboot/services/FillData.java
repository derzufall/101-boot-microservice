/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
package de.uniko.softlang.companies.springboot.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
*/
/**
 *
 * @author nbreest
 *//*
@RestController
public class FillData {
    @RequestMapping(value = "/customers/coreData/{id}", method = RequestMethod.GET)
    Customer getCoreData(@PathVariable("id") long id) {
        return customerRepository.findOne(id);
    }
    
    private static Customer createCustomer(int i) {
        Customer customer = new Customer(1L, new Date(), "C", "DT");
        customer.getContacts()
                .put(ContactType.MAIN,
                     new Contact("firstName" + i, "lastName" + i, "street" + i, Integer.toString(10000 + i),
                                 Integer.toString(i % 10), customer, ContactType.MAIN));
        return customer;
    }
}

}
*/