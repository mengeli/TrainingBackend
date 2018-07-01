package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Trainer;
import com.dto.TrainerRequest;
import com.dto.TrainerResponse;
import com.service.TrainerService;

@RestController
@RequestMapping("/trainer")
public class TrainerController {

	@Autowired
	private TrainerService trainerService;

	@PostMapping("/detail")
	public TrainerResponse getTrainerDetail(@RequestBody TrainerRequest request) {
		Trainer trainer = trainerService.getTrainerById(request.getId());
		TrainerResponse response = new TrainerResponse();
		response.setId(trainer.getId());
		response.setTrainerEid(trainer.getTrainerEid());
		response.setTrainerDescription(trainer.getTrainerDescription());
		response.setCreatorId(trainer.getCreatorId());
		response.setCreator(trainer.getCreator());
		response.setCreateDate(trainer.getCreateDate());
		response.setUpdatedById(trainer.getUpdatedById());
		response.setUpdatedBy(trainer.getUpdatedBy());
		response.setLastUpdateDate(trainer.getLastUpdateDate());
		response.setDeletedInd(trainer.getDeletedInd());
		response.setDeletedBy(trainer.getDeletedBy());
		response.setDeletedById(trainer.getDeletedById());
		return response;
	}
	
}
