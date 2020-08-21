package com.qdm.cg.assessment.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="initial_assessment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InitialAssessmentModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="inital_assessment_id")
	private long id;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="social_id")
	SocialHistoryAssessmentModel socialAssessModel;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="emotional_assessment_id")
	EmotionalAssessmentModel emotionalAssessmodel;
}
