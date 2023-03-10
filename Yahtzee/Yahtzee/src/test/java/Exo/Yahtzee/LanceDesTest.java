package Exo.Yahtzee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Exo.Yahtzee.lanceDes;


public class LanceDesTest {


    @Test
    public void calculScoreGrandeSuiteTest(){


        //bloc arrange

        String combinaison = "12345";
        lanceDes lance = new lanceDes(combinaison);
        //bloc act
        int s;
        s = lance.calculScore(combinaison);

        //bloc assert
        Assertions.assertEquals(40, s);

       // Assertions.fail("not good");

    }

    @Test
    public void calculScorePetiteSuiteTest(){


        //bloc arrange

         String combinaison = "23453";
        lanceDes lance = new lanceDes(combinaison);
        //bloc act
        int s;
        s = lance.calculScore(combinaison);

        //bloc assert
        Assertions.assertEquals(30, s);

        // Assertions.fail("not good");

    }

    @Test
    public void calculScoreBrelanTest(){


        //bloc arrange

        String combinaison = "33312";
        lanceDes lance = new lanceDes(combinaison);
        //bloc act
        int s;
        s = lance.calculScore(combinaison);

        //bloc assert
        Assertions.assertEquals(12, s);

        // Assertions.fail("not good");

    }

    @Test
    public void calculScoreCarreTest(){


        //bloc arrange

        String combinaison = "22225";
        lanceDes lance = new lanceDes(combinaison);
        //bloc act
        int s;
        s = lance.calculScore(combinaison);

        //bloc assert
        Assertions.assertEquals(13, s);

        // Assertions.fail("not good");

    }

    @Test
    public void calculScoreYahtzeeTest(){


        //bloc arrange

        String combinaison = "44444";
        lanceDes lance = new lanceDes(combinaison);
        //bloc act
        int s;
        s = lance.calculScore(combinaison);

        //bloc assert
        Assertions.assertEquals(50, s);

        // Assertions.fail("not good");

    }

    @Test
    public void calculScoreSansFigureTest(){


        //bloc arrange

        String combinaison = "33224";
        lanceDes lance = new lanceDes(combinaison);
        //bloc act
        int s;
        s = lance.calculScore(combinaison);

        //bloc assert
        Assertions.assertEquals(4, s);

        // Assertions.fail("not good");

    }

    @Test
    public void calculScoreFullTest(){


        //bloc arrange

        String combinaison = "33222";
        lanceDes lance = new lanceDes(combinaison);
        //bloc act
        int s;
        s = lance.calculScore(combinaison);

        //bloc assert
        Assertions.assertEquals(25, s);

        // Assertions.fail("not good");

    }
}
