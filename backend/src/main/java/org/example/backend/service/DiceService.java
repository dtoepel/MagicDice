package org.example.backend.service;

import org.example.backend.model.Dice;
import org.example.backend.repository.DiceRepo;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DiceService {

    private final DiceRepo diceRepo;

    public DiceService(DiceRepo diceRepo) {
        this.diceRepo = diceRepo;
    }

    public List<Dice> getAllElections() { return List.of(new Dice("testDice")); }
    //public List<Dice> getAllElections() { return diceRepo.findAll(); }
}
