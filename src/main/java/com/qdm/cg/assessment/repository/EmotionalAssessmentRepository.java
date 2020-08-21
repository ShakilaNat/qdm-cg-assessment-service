package com.qdm.cg.assessment.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qdm.cg.assessment.model.EmotionalAssessmentModel;
import com.qdm.cg.assessment.model.SocialHistoryAssessmentModel;

@Repository
public interface EmotionalAssessmentRepository extends JpaRepository<EmotionalAssessmentModel, Long> {

}
