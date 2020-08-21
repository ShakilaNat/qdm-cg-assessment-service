package com.qdm.cg.assessment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qdm.cg.assessment.model.SocialHistoryAssessmentModel;

@Repository
public interface SocialAssessmentRepository extends JpaRepository<SocialHistoryAssessmentModel, Long> {

}
