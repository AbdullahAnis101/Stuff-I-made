import org.junit.Test;

import static org.junit.Assert.*;

public class RockPaperScissorsGameTest {
@Test
    public void rockCrushesScissor(){
    RockPaperScissorsGame game = new RockPaperScissorsGame();
    String actualResult = game.determineWinner("rock","scissors");
    String expectedResult = "rock beats scissors";

    assertEquals(expectedResult, actualResult);

}
    @Test
    public void ScissorsCrushedRock(){
        RockPaperScissorsGame game = new RockPaperScissorsGame();
        String actualResult = game.determineWinner("scissors","rock");
        String expectedResult = "rock beats scissors";

        assertEquals(expectedResult, actualResult);

    }
@Test
    public void scissorsCutPaper(){
        RockPaperScissorsGame game = new RockPaperScissorsGame();
        String actualResult = game.determineWinner("scissors","paper");
        String expectedResult = "scissors beats paper";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void paperCutByScissors(){
        RockPaperScissorsGame game = new RockPaperScissorsGame();
        String actualResult = game.determineWinner("paper","scissors");
        String expectedResult = "scissors beats paper";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void rockCaughtByPaper(){
        RockPaperScissorsGame game = new RockPaperScissorsGame();
        String actualResult = game.determineWinner("rock","paper");
        String expectedResult = "paper beats rock";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void paperCatchesRock(){
        RockPaperScissorsGame game = new RockPaperScissorsGame();
        String actualResult = game.determineWinner("paper","rock");
        String expectedResult = "paper beats rock";
        assertEquals(expectedResult,actualResult);
    }

}
