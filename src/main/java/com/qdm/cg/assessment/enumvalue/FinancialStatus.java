package com.qdm.cg.assessment.enumvalue;

public  enum FinancialStatus {
	Good("Good"),
	self_sufficinet("Self-Sufficient"),
	financial_assistance("In need of financial assistance");
	
	private final String financialType;

	FinancialStatus(String journalType) {
	    this.financialType = journalType;
	}

	@Override
	public String toString() {
	    return financialType;
	}

	public static FinancialStatus valueOfOrDefault(String myValue) {
	    for(FinancialStatus type : FinancialStatus.class.getEnumConstants()) {
	        if(type.toString().equals(myValue)) {
	            return type;
	        }
	    }
	   throw new IllegalArgumentException("financialType not found");
	}

}
