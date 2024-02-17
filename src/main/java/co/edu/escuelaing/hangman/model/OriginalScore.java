package co.edu.escuelaing.hangman.model;

import org.springframework.stereotype.Component;

@Component("originalScore")
public class OriginalScore implements GameScore{
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 100 - 10 * incorrectCount;
    }
}
