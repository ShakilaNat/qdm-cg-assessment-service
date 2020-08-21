package com.qdm.cg.assessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qdm.cg.assessment.dto.SocialAssessmentDTO;
import com.qdm.cg.assessment.model.EmotionalAssessmentModel;
import com.qdm.cg.assessment.model.SocialHistoryAssessmentModel;
import com.qdm.cg.assessment.response.ResponseInfo;
import com.qdm.cg.assessment.serviceimpl.InitialAssessmentServiceImpl;
import com.qdm.cg.assessment.util.InitialAssessmentConstants;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/careGiver/initialAssessment")
@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class InitialAssessmentController {
	@Autowired
	InitialAssessmentServiceImpl initialAssesmentService;

	@PostMapping(value = "/socialAssessment/add", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
			MediaType.MULTIPART_FORM_DATA_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> addSocialAssessment(SocialAssessmentDTO socialDTO) {

		initialAssesmentService.addSocialAssessment(initialAssesmentService.convertDTOtoEntityUtil(socialDTO));
		log.info("Data saved successfully");
		return new ResponseEntity<Object>(
				new ResponseInfo(InitialAssessmentConstants.SUCCESSS, InitialAssessmentConstants.RESPONSE_VALUE, null),
				HttpStatus.CREATED);
	}

	@GetMapping(value = "/socialAssessment/get/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> getSocialAssessment(@PathVariable long id) {

		SocialHistoryAssessmentModel model = initialAssesmentService.getSocialAssessment(id);
		return new ResponseEntity<Object>(new ResponseInfo(InitialAssessmentConstants.SUCCESSS,
				InitialAssessmentConstants.GET_RESPONSE_VALUE, model), HttpStatus.OK);
	}

	@PostMapping(value = "/emotionalAssessment/add", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> addEmotionalAssessment(EmotionalAssessmentModel emotionalModel) {

		initialAssesmentService.addEmotionalAssessment(emotionalModel);
		log.info("Data saved successfully");
		return new ResponseEntity<Object>(
				new ResponseInfo(InitialAssessmentConstants.SUCCESSS, InitialAssessmentConstants.RESPONSE_VALUE, null),
				HttpStatus.CREATED);
	}

	@GetMapping(value = "/emotionalAssessment/get/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> getEmotionalAssessment(@PathVariable long id) {

		EmotionalAssessmentModel model = initialAssesmentService.getEmotionalAssessment(id);
		return new ResponseEntity<Object>(new ResponseInfo(InitialAssessmentConstants.SUCCESSS,
				InitialAssessmentConstants.GET_RESPONSE_VALUE, model), HttpStatus.OK);
	}

	
}
