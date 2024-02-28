package co.edu.escuelaing.hangman;

import co.edu.escuelaing.hangman.model.*;
import co.edu.escuelaing.hangman.model.dictionary.EnglishDictionaryDataSource;
import co.edu.escuelaing.hangman.model.dictionary.HangmanDictionary;
import co.edu.escuelaing.hangman.model.dictionary.SpanishDictionaryDataSource;
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
        gameModel.makeGuess("P");
        gameModel.makeGuess("O");
        gameModel.makeGuess("O");
        gameModel.makeGuess("L");
        Assert.assertEquals(gameModel.getScore(), 100);
    }
    @Test
    public void testBonusScorePoints(){
        dictionary = new EnglishDictionaryDataSource();
        gameScore = new BonusScore();
        GameModel gameModel = new GameModel(dictionary, gameScore);
        gameModel.changeWord("SAPO");
        gameModel.makeGuess("S");
        gameModel.makeGuess("A");
        gameModel.makeGuess("P");
        gameModel.makeGuess("Q");
        gameModel.makeGuess("O");
        Assert.assertEquals(gameModel.getScore(), 35);
    }
    @Test
    public void testPowerBonusScorePointsPast500(){
        dictionary = new EnglishDictionaryDataSource();
        gameScore = new PowerBonusScore();
        GameModel gameModel = new GameModel(dictionary, gameScore);
        gameModel.changeWord("SAPO");
        gameModel.makeGuess("S");
        gameModel.makeGuess("A");
        gameModel.makeGuess("P");
        gameModel.makeGuess("Q");
        gameModel.makeGuess("O");
        Assert.assertEquals(gameModel.getScore(), 500);
    }

    @Test
    public void testPowerBonusScorePointsOver500(){
        dictionary = new SpanishDictionaryDataSource();
        gameScore = new PowerBonusScore();
        GameModel gameModel = new GameModel(dictionary, gameScore);
        gameModel.changeWord("NO");
        gameModel.makeGuess("N");
        gameModel.makeGuess("I");
        gameModel.makeGuess("O");
        Assert.assertEquals(gameModel.getScore(), 25);
    }
}
