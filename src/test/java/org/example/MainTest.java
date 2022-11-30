package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    Main fizzBuzz = new Main();

    @Test
    public void vérifierQueLeChiffre1RenvoiUnStringUn() {
        //given

        //when
        String result = fizzBuzz.fizzBuzz(1);

        //then
        Assertions.assertThat(result).isEqualTo("1");
    }

    @Test
    public void vérifierQueLeChiffre2RenvoiUnEspaceDeux() {
        //given


        //when
        String result = fizzBuzz.fizzBuzz(2);

        //then
        Assertions.assertThat(result).isEqualTo("1_2");
    }

    @Test

    public void vérifierQueLeChiffre3EstUnMultipleRenvoiUnFizzBuzz() {
        //given


        //when
        String result = fizzBuzz.fizzBuzz(3);

        //then
        Assertions.assertThat(result).isEqualTo("1_2_fizz");

    }
        @Test

         public void vérifierQueQuatreRenvoiUnStringQuatre() {
            //given

            //when
        String result = fizzBuzz.fizzBuzz(4);
            //then
        Assertions.assertThat(result).isEqualTo ("1_2_fizz_4");
    }

    @Test

    public void vérifierQueCinqEstUnMultipleRenvoiBuzz() {
        //given

        //when
        String result = fizzBuzz.fizzBuzz(5);
        //then
        Assertions.assertThat(result).isEqualTo("1_2_fizz_4_buzz");
    }


}