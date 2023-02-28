
package Exo.Yahtzee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class lanceDes {
    public int score;
    public String combinaison;

    public lanceDes(String combinaison) {
        this.combinaison = combinaison;
    }

    public int calculScore(String combinaison) {
        int compt = 0;
        int nbr = 0;

        ArrayList<Integer> liste = new ArrayList<>();
        ArrayList<Integer> listeSansDoub = new ArrayList<>();
         for (int i=0; i<5; i++){
             liste.add(Integer.parseInt(String.valueOf(combinaison.charAt(i))));
         }

        Collections.sort(liste);

        for (int i = 0; i < liste.size(); i++){
            if (!listeSansDoub.contains(liste.get(i))){
                listeSansDoub.add(liste.get(i));
            }
        }
        int old = listeSansDoub.get(0);
        int res = 1;
        for (int i = 1; i < listeSansDoub.size(); i++){
           if (listeSansDoub.get(i)-1 == old){
               res++;
           }
           else {

               res = 1;
           }
            old = listeSansDoub.get(i);
        }

        //petite suite
        if (res == 4){
            score = 30;
            return score;
        }
        //grande suite
        if (res == 5){
            score = 40;
            return score;
        }

        //full
        old = liste.get(0);
        res = 1;
        int max = res;
        for (int i = 1; i < liste.size(); i++){
            if (liste.get(i) == old){
                res++;
            }
            else {
                max = res;

                if (max != 2 && max != 3) {
                    break;
                }

            res = 1;

            }
            old = liste.get(i);
        }

        if ((max == 2 && res == 3)||(max == 3 && res == 2) ){
            score = 25;
            return score;
        }

        //Yahtzee
            for (int j = 0; j < 6; j++) {
                nbr++;
                for (int i = 0; i < 5; i++) {
                    if (Integer.parseInt(String.valueOf(combinaison.charAt(i))) == nbr) {
                        compt++;
                    }
                    if (compt == 5) {
                        score = 50;
                        return score;
                    }

                    if (i == 4){
                        compt = 0;
                    }

                }

        }
        nbr = 0;
        // brelan + carré
            for (int j = 0; j < 6; j++) {
                nbr++;
                for (int i = 0; i < 5; i++) {

                    if (Integer.parseInt(String.valueOf(combinaison.charAt(i))) == nbr) {
                        compt++;
                    }

                    if (compt == 3) {
                        score = Integer.parseInt(String.valueOf(combinaison.charAt(0))) + Integer.parseInt(String.valueOf(combinaison.charAt(1))) + Integer.parseInt(String.valueOf(combinaison.charAt(2))) + Integer.parseInt(String.valueOf(combinaison.charAt(3))) + Integer.parseInt(String.valueOf(combinaison.charAt(4)));
                        return score;
                    }

                    if (i == 4) {
                        compt = 0;
                    }
                }
            }
            //sans figure
        score = listeSansDoub.get(listeSansDoub.size()-1);

        return score;
    }

    public int getScore() {
        return score;
    }


}