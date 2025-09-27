package org.example.backend.service;

import org.example.backend.model.Dice;
import org.example.backend.repository.DiceRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiceService {

    private final DiceRepo diceRepo;

    public DiceService(DiceRepo diceRepo) {
        this.diceRepo = diceRepo;
    }

    public List<Dice> getAllDice() { return diceRepo.findAll(); }
}
