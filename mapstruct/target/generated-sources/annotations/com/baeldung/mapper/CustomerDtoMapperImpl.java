package com.baeldung.mapper;

import com.baeldung.dto.CustomerDto;
import com.baeldung.entity.Customer;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-03T16:51:57-0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_221 (Oracle Corporation)"
)
public class CustomerDtoMapperImpl implements CustomerDtoMapper {

    @Override
    public CustomerDto from(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDto customerDto = new CustomerDto();

        customerDto.setForename( customer.getFirstName() );
        customerDto.setSurname( customer.getLastName() );

        return customerDto;
    }
}
