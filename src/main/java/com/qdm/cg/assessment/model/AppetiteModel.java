package com.qdm.cg.assessment.model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.qdm.cg.assessment.enumvalue.AppetiteValue;

public class AppetiteModel {
	
	@Enumerated(value=EnumType.STRING)
	private AppetiteValue appetite;

}
