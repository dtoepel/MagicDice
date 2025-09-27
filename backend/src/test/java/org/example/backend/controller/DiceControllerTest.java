package org.example.backend.controller;

import org.example.backend.model.Dice;
import org.example.backend.repository.DiceRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class DiceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private DiceRepo diceRepo;

    @Test
    void getAllDice() throws Exception {
        //GIVEN
        diceRepo.save(new Dice("foo"));

        //WHEN
        mockMvc.perform(MockMvcRequestBuilders.get("/api/dice"))
        //THEN
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json(
                    """ 
                                [
                                  {
                                    "testVal": "foo"
                                  }
                                ]
                                """));
    }
}