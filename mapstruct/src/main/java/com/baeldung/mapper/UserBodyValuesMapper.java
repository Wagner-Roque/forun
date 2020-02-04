package com.baeldung.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.baeldung.dto.UserBodyImperialValuesDTO;
import com.baeldung.entity.UserBodyValues;

@Mapper
public interface UserBodyValuesMapper extends BaseMapper {

    UserBodyValuesMapper INSTANCE = Mappers.getMapper(UserBodyValuesMapper.class);

    @Mapping(source = "pound", target = "kilogram", qualifiedBy = PoundToKilogramMapper.class)
    @Mapping(source = "inch", target = "centimeter", qualifiedByName = "inchToCentimeter")
    @Mapping(source = "strValue", target = "intValue", qualifiedByName = "strToInt")
    public UserBodyValues userBodyValuesMapper(UserBodyImperialValuesDTO dto);

   
}