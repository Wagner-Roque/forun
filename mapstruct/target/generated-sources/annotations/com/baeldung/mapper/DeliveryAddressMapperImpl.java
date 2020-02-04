package com.baeldung.mapper;

import com.baeldung.entity.Address;
import com.baeldung.entity.Customer;
import com.baeldung.entity.DeliveryAddress;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-03T16:51:58-0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_221 (Oracle Corporation)"
)
public class DeliveryAddressMapperImpl implements DeliveryAddressMapper {

    @Override
    public DeliveryAddress from(Customer customer, Address address) {
        if ( customer == null && address == null ) {
            return null;
        }

        DeliveryAddress deliveryAddress = new DeliveryAddress();

        if ( customer != null ) {
            deliveryAddress.setForename( customer.getFirstName() );
            deliveryAddress.setSurname( customer.getLastName() );
        }
        if ( address != null ) {
            deliveryAddress.setCounty( address.getCounty() );
            deliveryAddress.setStreet( address.getStreet() );
            deliveryAddress.setPostalcode( address.getPostalcode() );
        }

        return deliveryAddress;
    }

    @Override
    public DeliveryAddress updateAddress(DeliveryAddress deliveryAddress, Address address) {
        if ( address == null ) {
            return null;
        }

        deliveryAddress.setCounty( address.getCounty() );
        deliveryAddress.setPostalcode( address.getPostalcode() );
        deliveryAddress.setStreet( address.getStreet() );

        return deliveryAddress;
    }
}
