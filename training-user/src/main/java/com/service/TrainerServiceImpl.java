package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.TrainerDomain;
import com.dto.Trainer;



@Service
public class TrainerServiceImpl implements TrainerService {

	@Autowired
	private TrainerDomain trainerDomain;

	@Override
	public Trainer getTrainerById(Integer id) {
		return trainerDomain.getTrainerById(id);
	}

}
