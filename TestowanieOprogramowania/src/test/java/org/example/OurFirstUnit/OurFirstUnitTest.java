package org.example.OurFirstUnit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class OurFirstUnitTest {
    double firstNumber;
    double secondNumber;

    @BeforeAll
    static void initBeforeAll() {
        System.out.println("wykonujesie tylko 1 raz");
    }

    @BeforeEach
    void initBeforceEach() {
        firstNumber = 2;
        secondNumber = 3;
        System.out.println("Wykonuje sie prszed kazdym testem");
    }

    @AfterEach
    void doAfterEach() {
        System.out.println("Wykonuje sie po kazdym testem");
    }

    @AfterAll
    static void doAfterAll() {
        System.out.println("wykonujesie na samym concu 1 raz");
    }


    @Disabled
    @Test
    void mySecondTest() {
        System.out.println("jestem w tescie mySecondTest");
        // given // warunki początkowe

        // when // wykonanie testu
        final double actualResult = firstNumber * secondNumber;

        //then // sprawdzenie wyniku testu
        double expected = 6;
        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    void myFirstTest() {
        System.out.println("jestem w tescie myFirstTest");
        // given // warunki początkowe

        // when // wykonanie testu
        final double actualResult = firstNumber * secondNumber;

        //then // sprawdzenie wyniku testu
        double expected = 6;
        Assertions.assertEquals(expected, actualResult);
    }
}


