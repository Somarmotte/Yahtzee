package Exo.Yahtzee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Exo.Yahtzee.lanceDes;


public class LanceDesTest {


    @Test
    public void calculScoreTest(){


        //bloc arrange

        int combinaison = 12345;
        lanceDes lance = new lanceDes(combinaison);
        //bloc act
        int s;
        s = lance.calculScore(combinaison);

        //bloc assert
        Assertions.assertEquals(40, s);

       // Assertions.fail("not good");

    }
}
