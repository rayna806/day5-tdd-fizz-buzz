package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_input_1(){
        int order = 1;
         String word = FizzBuzz.countOff(order);
         assertEquals("1",word);

    }
    @Test
    public void should_return_1_when_input_2(){
        int order = 2;
        String word = FizzBuzz.countOff(order);
        assertEquals("2",word);

    }
}
