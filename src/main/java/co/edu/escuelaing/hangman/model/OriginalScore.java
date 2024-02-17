package co.edu.escuelaing.hangman.model;
//import co.edu.escuelaing.hangman.model.GameScore;

import org.springframework.stereotype.Component;

@Component("originalScore")
public class OriginalScore implements GameScore{


    //@Autowired
    /*
    Metodo que calcula el puntaje seg
    @param _correctCount : cuenta letras correctas
    @param _incorrectCount : cuenta letras incorrectas
     */
    public int calculateScore(int correctCount, int incorrectCount)
    {
        int score = 100 - 5 * incorrectCount;
        if (score < 0) {
            return 0;
        }
        return score;
    }
}