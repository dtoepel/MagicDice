package org.example.backend.service;

import org.example.backend.model.Dice;
import org.example.backend.repository.DiceRepo;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verifyNoMoreInteractions;

class DiceServiceTest {

    @Test
    void getAllDice() {
        // GIVEN
        DiceRepo diceRepo = Mockito.mock(DiceRepo.class);
        DiceService diceService = new DiceService(diceRepo);

        Dice dice = new Dice("test");

        // WHEN
        when(diceRepo.findAll()).thenReturn(java.util.List.of(dice));
        java.util.List<Dice> result = diceService.getAllDice();

        // THEN
        assertThat(result)
                .hasSize(1)
                .containsExactly(dice);
        verify(diceRepo, times(1)).findAll();
        verifyNoMoreInteractions(diceRepo);
    }
}