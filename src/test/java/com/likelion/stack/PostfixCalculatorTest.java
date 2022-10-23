package com.likelion.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostfixCalculatorTest {
    @Test
    @DisplayName("Postfix형식으로 된 식을 잘 계산 하는지")
    void calculatePostfix() {
        String stmt1 = "125*+";
        String stmt2 = "12+5*";

        PostfixCalculator pfc = new PostfixCalculator();

        assertEquals(11, pfc.calculatePostfix(stmt1));
        assertEquals(15, pfc.calculatePostfix(stmt2));

    }

}