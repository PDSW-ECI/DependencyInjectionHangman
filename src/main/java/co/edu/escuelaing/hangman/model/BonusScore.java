package co.edu.escuelaing.hangman.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component("bonusScore")
public class BonusScore implements GameScore{
    /*
    * @param correctCount
    * @param incorrectCount
    * */
    private int initialScore = 0;
    private int incorrect = 0;
    private int correct = 0;


    @Override
    public int calculateScore(int correctCount, int incorrectCount)
    {
        if(incorrect >= incorrectCount){
            if(correctCount - correct == 1){
                initialScore += 10;
            }
            else if(correctCount != 0){
                initialScore += 10 * correctCount;
            }
            correct = correctCount;
        }
        else{
            initialScore -= 5;
            incorrect = incorrectCount;
            if(initialScore < 0){ initialScore = 0;}
        }
        return initialScore;
    }

}
