package com.qdm.cg.assessment.serviceimpl;

import java.io.IOException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qdm.cg.assessment.dto.SocialAssessmentDTO;
import com.qdm.cg.assessment.exception.AssessmentNotFoundException;
import com.qdm.cg.assessment.model.EmotionalAssessmentModel;
import com.qdm.cg.assessment.model.GenegramModel;
import com.qdm.cg.assessment.model.SocialHistoryAssessmentModel;
import com.qdm.cg.assessment.repository.EmotionalAssessmentRepository;
import com.qdm.cg.assessment.repository.SocialAssessmentRepository;
import com.qdm.cg.assessment.service.InitialAssessmentService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class InitialAssessmentServiceImpl implements InitialAssessmentService {
	@Autowired
	SocialAssessmentRepository socialRepository;
	
	@Autowired
	EmotionalAssessmentRepository emotionalRepository;
	
	@Autowired
	ModelMapper modelMapper;

	@Override
	public void addSocialAssessment(SocialHistoryAssessmentModel sModel) {

		log.info("Social model values " + sModel.toString());
		socialRepository.save(sModel);

	}

	@Override
	public SocialHistoryAssessmentModel getSocialAssessment(Long id) {
		log.info("Social Assessment request id" + id);
		SocialHistoryAssessmentModel sModel = socialRepository.findById(id)
				.orElseThrow(() -> new AssessmentNotFoundException("Assessment Id not found " + id));
		return sModel;
	}

	public SocialHistoryAssessmentModel convertDTOtoEntityUtil(SocialAssessmentDTO socialDto) {

		SocialHistoryAssessmentModel socialAssesment = modelMapper.map(socialDto, SocialHistoryAssessmentModel.class);
		GenegramModel genegram = null;
		try {
			genegram = GenegramModel.builder().fileName(socialDto.getGenogram_tree().getName())
					.fileType(socialDto.getGenogram_tree().getContentType())
					.fileSize(socialDto.getGenogram_tree().getSize()).data(socialDto.getGenogram_tree().getBytes())
					.build();
		} catch (IOException iOException) {
			log.error("IOException in Intial asessment service" + iOException);
		}
		socialAssesment.setGenegramModel(genegram);

		log.info("Value stored in social asessment dto" + socialAssesment);
		return socialAssesment;

	}

	@Override
	public void addEmotionalAssessment(EmotionalAssessmentModel eModel) {
		log.info("Emotional Assessment save request ");
		emotionalRepository.save(eModel);
	}

	@Override
	public EmotionalAssessmentModel getEmotionalAssessment(Long id) {
		log.info("Emotional Assessment request id" + id);
		EmotionalAssessmentModel eModel = emotionalRepository.findById(id)
				.orElseThrow(() -> new AssessmentNotFoundException("Assessment Id not found " + id));
		return eModel;
	}

}
