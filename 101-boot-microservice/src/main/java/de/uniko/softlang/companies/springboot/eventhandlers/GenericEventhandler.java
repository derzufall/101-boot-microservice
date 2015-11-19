/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
package de.uniko.softlang.companies.springboot.eventhandlers;

import de.uniko.softlang.companies.springboot.entities.GenericEntity;
import de.uniko.softlang.companies.springboot.services.GenericRepository;
import java.time.DateTimeException;
import javax.inject.Inject;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
*/
/**
 *
 * @author nbreest
 */
/*@Component // so this is instanciated by the container
@ControllerAdvice // so spring knows exceptionhandling is done in here
@RepositoryEventHandler(GenericEntity.class) // eventhandling is done here too
public class GenericEventhandler {

    @Inject
    GenericRepository repo;

    GenericEntity e = null;

    @HandleBeforeCreate
    public void handleRenameCreate(GenericEntity entity) {
        repo.findAll().stream()
                .filter(locations -> !locations.getName().equals("Wursthannes"))
                .forEach(filteredcollections -> filteredcollections.setName(entity.getName()));

        e = entity;

        throw new DateTimeException("AHHHH!");
    }

    @ExceptionHandler(DateTimeException.class) // handle this exception
    @ResponseStatus(HttpStatus.BAD_REQUEST) // send this response status
    @ResponseBody // this method returns a custom response body
    GenericEntity handleBadDate(final DateTimeException e) {
        return this.e;
    }
}
*/