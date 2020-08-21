package com.qdm.cg.assessment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.qdm.cg.assessment.enumvalue.FlagValue;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "emotional_assessment")
public class EmotionalAssessmentModel extends AuditModel {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emotional_assessment_id")
	private long id;

	@Column(name = "feeling_tired")
	@Enumerated(EnumType.STRING)
	private FlagValue feelingTired;

	@Column(name = "feeling_hopeless")
	@Enumerated(EnumType.STRING)
	private FlagValue feelingHopeless;

	@Column(name = "poor_appetite")
	@Enumerated(EnumType.STRING)
	private FlagValue poorAppetite;

	@Column(name = "feeling_guilt")
	@Enumerated(EnumType.STRING)
	private FlagValue feelingOfGuilt;

	@Column(name = "loss_of_concentration")
	@Enumerated(EnumType.STRING)
	private FlagValue lossOfConcentration;

	@Column(name = "suicidal_thoughts")
	@Enumerated(EnumType.STRING)
	private FlagValue suicidalThoughts;

	@Column(name = "feeling_moody")
	@Enumerated(EnumType.STRING)
	private FlagValue feelingMoody;

	@Column(name = "uncontrolled_pain_symptoms")
	@Enumerated(EnumType.STRING)
	private FlagValue uncontrolledPainSymptoms;

}
