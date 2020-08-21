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
@Table(name = "shortness_of_breath")
public class ShortnessofBreathModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "breath_id")
	private long id;
	private String shortnessOfBreath;
	private String rest;
	private String onExertion;
	private String relievedBy;
}
