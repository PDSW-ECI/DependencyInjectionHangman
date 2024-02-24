package co.edu.escuelaing.hangman.model;

import org.springframework.stereotype.Component;

@Component("PowerBonusScore")
public class PowerBonusScore implements GameScore{
    private int initialScore;
    private int incorrect = 0;
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        if(correctCount == 0){initialScore = 0;};
        if(incorrect >= incorrectCount){
            if(correctCount != 0){ initialScore += Math.pow(5,correctCount);};

        }
        else{
            initialScore -= 8;
            incorrect = incorrectCount;
            if(initialScore < 0){ initialScore = 0;}
        }
        if(initialScore > 500) initialScore = 500;
        return initialScore;
    }
}
