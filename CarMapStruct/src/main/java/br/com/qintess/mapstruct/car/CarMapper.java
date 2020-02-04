package br.com.qintess.mapstruct.car;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper 
public abstract interface CarMapper {
		
	CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);
	
	CarDto carToCarDto(Car car);
	
}