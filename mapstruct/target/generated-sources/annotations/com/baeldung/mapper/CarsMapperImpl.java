package com.baeldung.mapper;

import com.baeldung.dto.CarDTO;
import com.baeldung.entity.Car;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-03T16:51:58-0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_221 (Oracle Corporation)"
)
public class CarsMapperImpl extends CarsMapper {

    @Override
    public CarDTO toCarDto(Car car) {
        if ( car == null ) {
            return null;
        }

        CarDTO carDTO = new CarDTO();

        enrichDTOWithFuelType( car, carDTO );

        carDTO.setId( car.getId() );
        carDTO.setName( car.getName() );

        convertNameToUpperCase( carDTO );

        return carDTO;
    }
}
