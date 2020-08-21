package com.qdm.cg.assessment.model;

import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseModel extends AuditModel{
	
	private long care_giver_id;
	
	private String care_giver_name;
	
	private String patient_name;

}
