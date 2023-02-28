
package Exo.Yahtzee;

public class lanceDes {
    public int score;
    public int combinaison;

    public lanceDes(int combinaison) {
        this.combinaison = combinaison;
        this.score = score;
    }

    public int calculScore(int combinaison) {
        if (combinaison == 12345){
            score = 40;
        }
        return score;
    }

    public int getScore() {
        return score;
    }


}