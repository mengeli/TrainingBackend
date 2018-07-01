package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dto.Trainer;

public interface TrainerRepository extends JpaRepository<Trainer, Integer> {

}
