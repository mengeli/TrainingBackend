package com.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.Trainer;
import com.exception.TrainerExceptionCode;
import com.msclub.base.exception.TechnicalFailureException;
import com.repository.TrainerRepository;


@Service
public class TrainerDomainImpl implements TrainerDomain {

	@Autowired
	private TrainerRepository trainerRepository;

	@Override
	public Trainer getTrainerById(Integer id) {
		try {
			return trainerRepository.findOne(id);
		} catch (Exception e) {
			throw new TechnicalFailureException(TrainerExceptionCode.ERROR_010002, e);
		}
	}

}
