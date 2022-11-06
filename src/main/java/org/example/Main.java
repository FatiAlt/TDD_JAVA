package org.example;

public class Main {
    public String fizzBuzz(int number) {

        for (int i = 0; i < 3; i++)
            System.out.println(i);


       if (number == 1) {
            return "1";

       } else if (number == 2) {
            return "1_2";

      } else if (number == 3) {
            return "1_2_fizz";
       }

         if (number == 4) {
            return "1_2_fizz_4";
        }

        else if (number == 5) {
            return "1_2_fizz_4_buzz";
        }



        return null;

    }
    }








