package edu.iastate.its.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicProblemUTest {

    private BasicProblem basicProblem;

    @BeforeEach
    void setUp() {
        basicProblem = new BasicProblem();
    }

    @Test
    void test1() {
        assertEquals(8, basicProblem.doSum(5, 3));
    }
}
