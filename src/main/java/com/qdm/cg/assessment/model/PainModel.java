package com.qdm.cg.assessment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "pain")
public class PainModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pain_id")
	private long id;
	private String pain;
	private String siteOfPain;
	private String radiationOfPain;
	private String nativeOfpain;
	private String painAggravatedBy;
	private String painScore;
	private String numericalScore;
	private String painRelievedBy;
	private String painMedications;
	private String breakthroughDoses;
	private String painRelievedAfter;
	private String psaiNumericalScale;
	private String psaiVerbalDescriptionScore;

}
