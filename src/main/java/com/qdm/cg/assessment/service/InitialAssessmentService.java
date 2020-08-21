package com.qdm.cg.assessment.service;

import org.springframework.stereotype.Service;

import com.qdm.cg.assessment.model.EmotionalAssessmentModel;
import com.qdm.cg.assessment.model.SocialHistoryAssessmentModel;

@Service
public interface InitialAssessmentService {

	public void addSocialAssessment(SocialHistoryAssessmentModel sModel);
	public SocialHistoryAssessmentModel getSocialAssessment(Long id);
	public void addEmotionalAssessment(EmotionalAssessmentModel eModel);
	public EmotionalAssessmentModel getEmotionalAssessment(Long id);
	
	
}
