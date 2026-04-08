package com.example.accessingdatarest;

import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler(Person.class) // le esta diciendo al springboot q vigile q hace la clase person
public class PersonEventHandler {

    @HandleAfterCreate
    public void handlePersonAfterCreate(Person p) {
        // despues de crear una persona en la base, guardamos un dato en el Singleton
        Cache.getInstance().setCacheValue("ultimo_ingreso", p.getFirstName());

        System.out.println("!!!! Singleton Caché actualizado: Se ingresó a " + p.getFirstName());
    }
}