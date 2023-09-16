package org.example.zad3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class UserTest {

    @Test
    void isValidatedNameTest() {
        User user = new User();
        user.setName("NowyUser");

        boolean result = user.validName();

        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"NowyUser", "U", "aaaaaa", "1"})
    void isValidatedName2Test(String name) {
        User user = new User();
        user.setName(name);

        boolean result = user.validName();

        Assertions.assertTrue(result);
    }

    @Test
    void shouldThrowExceptionAfterValidName(){
        User user = new User();
        user.setName("");

        IllegalArgumentException illegalArgumentException = Assertions.assertThrows
                (
                        IllegalArgumentException.class,
//                        user::valid
                        () -> user.valid()
                );

        String actualMessage = illegalArgumentException.getMessage();
        Assertions.assertEquals("bad name", actualMessage);
    }

}



















//    private  User user;
//    @BeforeEach
//    void initUser() {
//        User user= new User();
//    }
//
//    @ParameterizedTest
//    @MethodSource("userName")
//    void checkEmailsTest(String name, boolean isTrue) {
//        user.setName(name);
//
//        boolean isValidActual = user.valid(name);
//        Assertions.assertTrue(isValidActual);
//    }
//
//    @Test
//    void checkSurnameTest() {
//        //giwen
//        user.setSurname("Morawiecki");
//        boolean isValidActual=user.validName();
//        //when
//        assertTrue(isValid);
//    }
//
//    private static Stream<Arguments> userName() {
//        return Stream.of(
//                Arguments.of("Zdzislaw", true),
//                Arguments.of("Zdzislaw2", false),
//                Arguments.of("michal", true),
//                Arguments.of("10pawel", false),
//                Arguments.of("", false)
//
//        );
//    }
//
//
//}