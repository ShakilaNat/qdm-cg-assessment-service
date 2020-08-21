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
@Table(name = "history")
public class HistoryModel {
//	Histroy of current illness
//	Past medical illness
//	History of surgery
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "history_id")
	private long id;
	
	@Column(name = "history_of_current_illness")
	private String historyOfCurrentIllness;
	
	@Column(name = "past_medical_illness")
	private String pastMedicalIllness;
	
	@Column(name = "history_of_surgery")
	private String historyOfSurgery;

}
