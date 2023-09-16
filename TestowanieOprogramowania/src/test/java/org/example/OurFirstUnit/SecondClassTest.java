package org.example.OurFirstUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SecondClassTest {

    @Test
    public void shouldBeFalse() {
        boolean value = false;

        Assertions.assertFalse(value);
        Assertions.assertFalse(!value, "Testowanie za pomocą assertFalse");
    }

    @Test
    void shouldCompareTwoListTest() {
        //given

        //when

        //then
        List<Integer> actual = List.of(1, 2, 3);

        List<Integer> expected = List.of(1, 3, 2);

        // Gdy mamy wiele asercji dobra praktyka jest zawrzec je w assertAll
        //Assertions.assertIterableEquals(expected, actual);
        //Assertions.assertEquals(expected.size(), actual.size());
        //Assertions.assertEquals(expected.get(0), actual.get(0));
        //Assertions.assertEquals(expected.get(1), actual.get(2));
        //Assertions.assertEquals(expected.get(2), actual.get(1));

        Assertions.assertAll
                (
                        () -> Assertions.assertEquals(expected.size(), actual.size()),
                        () -> Assertions.assertEquals(expected.get(0), actual.get(0)),
                        () -> Assertions.assertEquals(expected.get(1), actual.get(2)),
                        () -> Assertions.assertEquals(expected.get(2), actual.get(1))
                );

    }

}