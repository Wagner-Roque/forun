package com.baeldung.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarDTO {
    private int id;
    private String name;
    private FuelType fuelType;
    
    public CarDTO() {
    	
    }
    
	public CarDTO(int id, String name, FuelType fuelType) {
		this.id = id;
		this.name = name;
		this.fuelType = fuelType;
	}

	public FuelType setFuelType(FuelType electric) {
		return electric;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FuelType getFuelType() {
		return fuelType;
	}
    
}
