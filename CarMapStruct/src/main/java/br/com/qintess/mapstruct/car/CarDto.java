package br.com.qintess.mapstruct.car;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarDto {
	
	private String make;
	private int seatCount;
	private String tipo;
}