package com.baeldung.mapper;

import org.mapstruct.Named;

public interface BaseMapper {
	
	    @Named("inchToCentimeter")
	    public static double inchToCentimeter(int inch) {
	        return inch * 2.54;
	    }

	    @PoundToKilogramMapper
	    public static double poundToKilogram(int pound) {
	        return pound * 0.4535; 
	    }
	    
	    @Named("strToInt")
	    public static int strToInt(String str) {
	    	if (str !=null && str.trim().matches("[0-9]+")) {
	    		return  Integer.valueOf(str.trim());
	    	}	        
	    	return 0;
	    }
	
}