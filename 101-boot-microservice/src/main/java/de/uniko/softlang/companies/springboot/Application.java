/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.uniko.softlang.companies.springboot;

import de.uniko.softlang.companies.springboot.absgeneric.AbstractEntity;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

/**
 *
 * @author nbreest
 */
@SpringBootApplication
public class Application {

    public static void main(String... args) {
        new SpringApplicationBuilder(Application.class).run(args);
    }

    /*@Configuration
    protected static class IdExposingRepositoryRestMvcConfiguration extends RepositoryRestMvcConfiguration {
     
        @Override
        protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
           config.exposeIdsFor(AbstractEntity.class); // add all classes with IDs to be exposed here
        }
    }*/
}
