
package Exo.Yahtzee;

public class lanceDes {
    public int score = 20;
    public int combinaison;

    public lanceDes(int combinaison) {
        this.combinaison = combinaison;
    }

    public int calculScore() {
        score = score +20;
        return score;
    }

    public int getScore() {
        return score;
    }


}