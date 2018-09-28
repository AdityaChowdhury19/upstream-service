package com.matchzone.upstreamservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import com.matchzone.upstreamservice.model.AcademicDetails;
import com.matchzone.upstreamservice.model.Certification;
import com.matchzone.upstreamservice.model.Location;
import com.matchzone.upstreamservice.model.PersonalInfo;
import com.matchzone.upstreamservice.model.Project;
import com.matchzone.upstreamservice.model.Skills;
import com.matchzone.upstreamservice.model.User;

public class UpstreamServiceController {

	private KafkaTemplate<String, User> userKafkaTemplate;
	private KafkaTemplate<String, AcademicDetails> acadKafkaTemplate;
	private KafkaTemplate<String, Certification> certiKafkaTemplate;
	private KafkaTemplate<String, Location> locKafkaTemplate;
	private KafkaTemplate<String, PersonalInfo> personKafkaTemplate;
	private KafkaTemplate<String, Project> projKafkaTemplate;
	private KafkaTemplate<String, Skills> skillsKafkaTemplate;
	
	@Autowired
	public UpstreamServiceController(KafkaTemplate<String, User> userKafkaTemplate,
			KafkaTemplate<String, AcademicDetails> acadKafkaTemplate,
			KafkaTemplate<String, Certification> certiKafkaTemplate, KafkaTemplate<String, Location> locKafkaTemplate,
			KafkaTemplate<String, PersonalInfo> personKafkaTemplate, KafkaTemplate<String, Project> projKafkaTemplate,
			KafkaTemplate<String, Skills> skillsKafkaTemplate) {
		super();
		this.userKafkaTemplate = userKafkaTemplate;
		this.acadKafkaTemplate = acadKafkaTemplate;
		this.certiKafkaTemplate = certiKafkaTemplate;
		this.locKafkaTemplate = locKafkaTemplate;
		this.personKafkaTemplate = personKafkaTemplate;
		this.projKafkaTemplate = projKafkaTemplate;
		this.skillsKafkaTemplate = skillsKafkaTemplate;
	}
	
}
