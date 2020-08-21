package com.qdm.cg.assessment.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.qdm.cg.assessment.enumvalue.EmotionalStatus;
import com.qdm.cg.assessment.enumvalue.FinancialStatus;
import com.qdm.cg.assessment.enumvalue.MaritalStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "social_assessment")
public class SocialHistoryAssessmentModel extends BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "social_id")
	private long id;
	
	@Enumerated(EnumType.STRING)
	private MaritalStatus marital_status;

	private String present_occupation;

	private String past_occupation;

	private String religion_of_family;
	
	@Enumerated(EnumType.STRING)
	private EmotionalStatus emotional_status;
	
	@Enumerated(EnumType.STRING)
	private FinancialStatus financial_status;
	
	private String other_social_problems;
	

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="genegram_id")
	private GenegramModel genegramModel;

}
