package co.edu.escuelaing.hangman;

import co.edu.escuelaing.hangman.model.GameModel;
import co.edu.escuelaing.hangman.model.GameScore;
import co.edu.escuelaing.hangman.model.OriginalScore;
import co.edu.escuelaing.hangman.model.dictionary.EnglishDictionaryDataSource;
import co.edu.escuelaing.hangman.model.dictionary.HangmanDictionary;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GameScoreTest {
    private GameScore gameScore;
    private HangmanDictionary dictionary;
    @Test
    public void shouldReturnCorrectScoreOriginalScore(){
        dictionary = new EnglishDictionaryDataSource();
        gameScore = new OriginalScore();
        GameModel gameModel = new GameModel(dictionary, gameScore);
        gameModel.changeWord("POOL");
        System.out.println(gameModel.getWordLength());
        System.out.println(gameModel.getRandomWord());
        gameModel.makeGuess("P");
        gameModel.makeGuess("O");
        gameModel.makeGuess("O");
        gameModel.makeGuess("L");
        Assert.assertEquals(gameModel.getScore(), 100);
    }
}
