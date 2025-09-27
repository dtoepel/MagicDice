package org.example.backend.repository;

import org.example.backend.model.Dice;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DiceRepo extends MongoRepository<Dice,String> {}
