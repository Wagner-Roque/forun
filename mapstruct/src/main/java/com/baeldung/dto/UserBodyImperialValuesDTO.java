package com.baeldung.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserBodyImperialValuesDTO {
    private int inch;
    private int pound;
    private String strValue;
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	public int getPound() {
		return pound;
	}
	public void setPound(int pound) {
		this.pound = pound;
	}
	public String getStrValue() {
		return strValue;
	}
	public void setStrValue(String strValue) {
		this.strValue = strValue;
	}
    
}