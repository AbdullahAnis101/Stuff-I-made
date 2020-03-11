/**
 * @author  Abdullah
 * This class follows the rules of rock,paper,scissors. Which is rock beats scissors. Paper beats rock. And scissors beats paper.
 */
public class RockPaperScissorsGame {
public String determineWinner(String gesture1, String gesture2){
    if((gesture1.equals("rock") && gesture2.equals("scissors") || (gesture1.equals("scissors") && gesture2.equals("rock")))){
        return "rock beats scissors";
    }
    if((gesture1.equals("scissors") && gesture2.equals("paper") || gesture1.equals("paper") && gesture2.equals("scissors"))){
        return "scissors beats paper";
    }
    if((gesture1.equals("rock") && gesture2.equals("paper") || (gesture1.equals("paper") && gesture2.equals("rock")))){
        return "paper beats rock";
    }
    return null;
}
}
