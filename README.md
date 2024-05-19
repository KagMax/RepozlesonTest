# Testowanie Jednostkowe w Javie z JUnit Jupiter

## Cel

Demonstracja podstawowych zasad testowania jednostkowego w Javie z wykorzystaniem frameworka JUnit Jupiter.

## Zakres

### Klasy Testowe

* **OurFirstUnitTest:** Testuje podstawowe funkcje testowania jednostkowego.
* **CalculatorTest:** Weryfikuje funkcjonalność klasy `Calculator`.
* **EmailValidatorTest:** Sprawdza poprawność identyfikacji poprawnych i niepoprawnych adresów email.
* **UserTest:** Skupia się na walidacji imion i nazwisk użytkowników.

### Funkcje Testowane

* Mnożenie dwóch liczb (OurFirstUnitTest)
* Dodawanie, odejmowanie, mnożenie i dzielenie dwóch liczb (CalculatorTest)
* Obsługa dzielenia przez zero (CalculatorTest)
* Walidacja poprawnych i niepoprawnych adresów email (EmailValidatorTest)
* Walidacja poprawnych i niepoprawnych imion użytkowników (UserTest)
* Walidacja nazwisk użytkowników (UserTest)

### Metody Testowe

* Wykorzystanie adnotacji JUnit Jupiter: `@BeforeAll`, `@BeforeEach`, `@AfterEach`, `@AfterAll`, `@Test`, `@DisplayName`, `@ValueSource`, `@MethodSource`, `@ParameterizedTest`
* Zastosowanie asercji JUnit Jupiter: `Assertions.assertEquals`, `Assertions.assertTrue`, `Assertions.assertFalse`, `Assertions.assertThrows`
* Komentarze `//given`, `//when`, `//then` do opisywania etapów testu

## Wnioski

Te testy demonstrują istotne aspekty testowania jednostkowego:

* **Nauka podstaw:** Poznanie kluczowych pojęć i technik testowania jednostkowego.
* **Zrozumienie JUnit Jupiter:** Wykorzystanie frameworka do pisania i uruchamiania testów.
* **Sprawdzanie kodu:** Weryfikacja działania metod i klas w izolacji.
* **Wczesne wykrywanie błędów:** Identyfikacja i naprawa błędów przed wdrożeniem kodu.
* **Poprawa jakości kodu:** Wpisanie czystego, spójnego i niezawodnego kodu.
* **Zwiększenie pewności w kod:** Potwierdzenie zgodności kodu z oczekiwaniami.

## Dodatkowe uwagi

Prezentowane testy stanowią podstawę testowania jednostkowego. Bardziej złożone testy mogą obejmować obiekty mockowane, różne scenariusze i parametryzację. Należy pisać testy jednostkowe zwięźle, czytelnie i informacyjnie. Regularne testowanie jednostkowe jest integralną częścią procesu rozwoju oprogramowania, zapewniając wysoką jakość, niezawodność i stabilność kodu.

## Zalecenia

* Udoskonalić testy `UserTest` o walidację nazwisk.
* Wyjaśnić potencjalnie mylący test walidacji emaili w `UserTest`.
* Rozważyć stosowanie `@BeforeEach` dla lepszej organizacji testów.
* Upewnić się, że testy targetują poprawną metodę walidacji (`validName` lub `valid`).


