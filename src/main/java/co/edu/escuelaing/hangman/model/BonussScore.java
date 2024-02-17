package co.edu.escuelaing.hangman.model;

import org.springframework.stereotype.Component;

@Component("bonusScore")
public class BonussScore implements GameScore {

    public int calculateScore(int _correctCount, int _incorrectCount)
    {
        int ret = 0;
        return ret;
    }
}