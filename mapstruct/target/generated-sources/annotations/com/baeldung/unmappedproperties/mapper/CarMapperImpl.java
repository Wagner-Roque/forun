package com.baeldung.unmappedproperties.mapper;

import com.baeldung.unmappedproperties.dto.CarDTO;
import com.baeldung.unmappedproperties.entity.Car;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-03T17:09:42-0200",
    comments = "version: 1.3.0.Final, compiler: Eclipse JDT (IDE) 3.18.0.v20190522-0428, environment: Java 1.8.0_221 (Oracle Corporation)"
)
public class CarMapperImpl implements CarMapper {

    @Override
    public CarDTO carToCarDTO(Car car) {
        if ( car == null ) {
            return null;
        }

        CarDTO carDTO = new CarDTO();

        carDTO.setId( car.getId() );
        carDTO.setName( car.getName() );

        return carDTO;
    }
}
