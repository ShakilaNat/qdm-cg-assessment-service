package com.qdm.cg.assessment.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;

import org.springframework.web.multipart.MultipartFile;

import com.qdm.cg.assessment.enumvalue.EmotionalStatus;
import com.qdm.cg.assessment.enumvalue.FinancialStatus;
import com.qdm.cg.assessment.enumvalue.MaritalStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SocialAssessmentDTO {
	
	private MaritalStatus marital_status;

	private String present_occupation;

	private String past_occupation;

	private String religion_of_family;

	private EmotionalStatus emotional_status;
	

	private FinancialStatus financial_status;
	
	private String other_social_problems;

    private MultipartFile genogram_tree;

}
