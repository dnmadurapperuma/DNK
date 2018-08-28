package com.dnk.spring.model;

public enum Attributes {
	
	AREA                ("area"),  
    AMONT               ("amount"),  
    MANUFACTURED_YEAR   ("mYear"), 
    MODEL               ("model"), 
    NUMBER_OF_OWNERS    ("ownerCount"), 
    TYPE                ("type"), 
    PRICE   			("price"); 
	
    

    private final String val;

    Attributes(String val) {
        this.val = val;
    }
    
    public String getLevelCode() {
        return this.val;
    }

}
