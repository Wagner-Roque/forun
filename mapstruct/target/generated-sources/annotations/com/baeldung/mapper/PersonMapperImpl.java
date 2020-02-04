package com.baeldung.mapper;

import com.baeldung.dto.PersonDTO;
import com.baeldung.entity.Person;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-03T16:51:58-0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_221 (Oracle Corporation)"
)
public class PersonMapperImpl implements PersonMapper {

    @Override
    public PersonDTO personToPersonDTO(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonDTO personDTO = new PersonDTO();

        if ( person.getId() != null ) {
            personDTO.setId( person.getId() );
        }
        else {
            personDTO.setId( java.util.UUID.randomUUID().toString() );
        }
        personDTO.setName( person.getName() );

        return personDTO;
    }
}
