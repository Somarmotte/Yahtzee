package Exo.Yahtzee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LanceDesTest {


    @Test
    public void calculScoreTest(){


     //   //bloc arrange
        int score = 20;
        
        //bloc act
        int calcul = score + score;

        //bloc assert
        Assertions.assertEquals(40, calcul);

       // Assertions.fail("not good");

    }
}
