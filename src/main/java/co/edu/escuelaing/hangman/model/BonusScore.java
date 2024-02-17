package co.edu.escuelaing.hangman.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component("bonusScore")
public class BonusScore implements GameScore{
    /*
    * @param correctCount
    * @param incorrectCount
    * */
    private int initialScore;
    @Override
    public int calculateScore(int correctCount, int incorrectCount)
    {
        return 0;
    }

}
