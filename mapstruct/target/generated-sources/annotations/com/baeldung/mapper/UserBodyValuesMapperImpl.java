package com.baeldung.mapper;

import com.baeldung.dto.UserBodyImperialValuesDTO;
import com.baeldung.entity.UserBodyValues;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-03T16:51:58-0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_221 (Oracle Corporation)"
)
public class UserBodyValuesMapperImpl implements UserBodyValuesMapper {

    @Override
    public UserBodyValues userBodyValuesMapper(UserBodyImperialValuesDTO dto) {
        if ( dto == null ) {
            return null;
        }

        UserBodyValues userBodyValues = new UserBodyValues();

        userBodyValues.setKilogram( BaseMapper.poundToKilogram( dto.getPound() ) );
        userBodyValues.setIntValue( BaseMapper.strToInt( dto.getStrValue() ) );
        userBodyValues.setCentimeter( BaseMapper.inchToCentimeter( dto.getInch() ) );

        return userBodyValues;
    }
}
