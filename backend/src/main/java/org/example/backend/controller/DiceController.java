package org.example.backend.controller;

import org.example.backend.model.Dice;
import org.example.backend.service.DiceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dice")
public class DiceController {
    private final DiceService diceService;

    public DiceController(DiceService diceService) {
        this.diceService = diceService;
    }

    @GetMapping
    public List<Dice> getAllDice() { return diceService.getAllDice(); }

}
