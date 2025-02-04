import java.util.Random;
import java.util.Scanner;
/**
 ** Ibrahim Shahid
 * Date: 12/27/2024
 * North Carolina Virtual Public Schools
 * Description: basketball guessing algo
 * Difficulties:  i had a lot of hard time in terms of organizing the entire code project and also trying to implement other features within the program. i mainly used thinkjava2e and other online resources in order to help me complete this task
 * You can you modulo to identify odd and even numbers in java
 */
public class basketball {
    private String teamOneName;
    private String teamTwoName;
    private int teamOneScore;
    private int teamTwoScore;
    private String gameStatus;

    public basketball(String teamOneName, String teamTwoName) {
        this.teamOneName = teamOneName;
        this.teamTwoName = teamTwoName;
        this.teamOneScore = 0;
        this.teamTwoScore = 0;
        this.gameStatus = "In-Progress";
    }

  
    public void recordTeamPoints(int teamOnePoints, int teamTwoPoints) {
        teamOneScore += teamOnePoints;
        teamTwoScore += teamTwoPoints;
    }

    
    public String getStatus() {
        return gameStatus;
    }

    
    public String getScores() {
        return teamOneName + " " + teamOneScore + ", " + teamTwoName + " " + teamTwoScore;
    }

    // Return the winning team or indicate if tied
    public String getWinningTeam() {
        if (teamOneScore > teamTwoScore) {
            return teamOneName + " is winning";
        } else if (teamTwoScore > teamOneScore) {
            return teamTwoName + " is winning";
        } else {
            return "Teams are tied";
        }
    }

    // Check if the game is finished
    public boolean isGameFinished(int maxScore) {
        if (teamOneScore >= maxScore || teamTwoScore >= maxScore) {
            gameStatus = "Finished";
            return true;
        }
        return false;
    }

    // Get the winner or indicate a tie
    public String getWinner() {
        if (teamOneScore > teamTwoScore) {
            return teamOneName + " is the winner";
        } else if (teamTwoScore > teamOneScore) {
            return teamTwoName + " is the winner";
        } else {
            return "The game is a tie";
        }
    }
}
/*
 * expected output
 * Enter Team 1 Name: budgies
Enter Team 2 Name: cockatiels
Enter max score: 100
Random # for budgies: 1 for cockatiels: 2
budgies 1, cockatiels 2; cockatiels is winning
Random # for budgies: 3 for cockatiels: 1
budgies 4, cockatiels 3; budgies is winning
Random # for budgies: 3 for cockatiels: 1
budgies 7, cockatiels 4; budgies is winning
Random # for budgies: 2 for cockatiels: 3
budgies 9, cockatiels 7; budgies is winning
Random # for budgies: 3 for cockatiels: 3
budgies 12, cockatiels 10; budgies is winning
Random # for budgies: 1 for cockatiels: 2
budgies 13, cockatiels 12; budgies is winning
Random # for budgies: 1 for cockatiels: 2
budgies 14, cockatiels 14; Teams are tied
Random # for budgies: 2 for cockatiels: 3
budgies 16, cockatiels 17; cockatiels is winning
Random # for budgies: 2 for cockatiels: 3
budgies 18, cockatiels 20; cockatiels is winning
Random # for budgies: 3 for cockatiels: 2
budgies 21, cockatiels 22; cockatiels is winning
Random # for budgies: 1 for cockatiels: 3
budgies 22, cockatiels 25; cockatiels is winning
Random # for budgies: 3 for cockatiels: 3
budgies 25, cockatiels 28; cockatiels is winning
Random # for budgies: 1 for cockatiels: 2
budgies 26, cockatiels 30; cockatiels is winning
Random # for budgies: 3 for cockatiels: 2
budgies 29, cockatiels 32; cockatiels is winning
Random # for budgies: 1 for cockatiels: 3
budgies 30, cockatiels 35; cockatiels is winning
Random # for budgies: 1 for cockatiels: 1
budgies 31, cockatiels 36; cockatiels is winning
Random # for budgies: 2 for cockatiels: 1
budgies 33, cockatiels 37; cockatiels is winning
Random # for budgies: 3 for cockatiels: 2
budgies 36, cockatiels 39; cockatiels is winning
Random # for budgies: 1 for cockatiels: 3
budgies 37, cockatiels 42; cockatiels is winning
Random # for budgies: 1 for cockatiels: 2
budgies 38, cockatiels 44; cockatiels is winning
Random # for budgies: 3 for cockatiels: 2
budgies 41, cockatiels 46; cockatiels is winning
Random # for budgies: 1 for cockatiels: 3
budgies 42, cockatiels 49; cockatiels is winning
Random # for budgies: 1 for cockatiels: 3
budgies 43, cockatiels 52; cockatiels is winning
Random # for budgies: 1 for cockatiels: 1
budgies 44, cockatiels 53; cockatiels is winning
Random # for budgies: 2 for cockatiels: 1
budgies 46, cockatiels 54; cockatiels is winning
Random # for budgies: 1 for cockatiels: 2
budgies 47, cockatiels 56; cockatiels is winning
Random # for budgies: 3 for cockatiels: 3
budgies 50, cockatiels 59; cockatiels is winning
Random # for budgies: 1 for cockatiels: 1
budgies 51, cockatiels 60; cockatiels is winning
Random # for budgies: 2 for cockatiels: 3
budgies 53, cockatiels 63; cockatiels is winning
Random # for budgies: 2 for cockatiels: 1
budgies 55, cockatiels 64; cockatiels is winning
Random # for budgies: 2 for cockatiels: 1
budgies 57, cockatiels 65; cockatiels is winning
Random # for budgies: 2 for cockatiels: 1
budgies 59, cockatiels 66; cockatiels is winning
Random # for budgies: 1 for cockatiels: 3
budgies 60, cockatiels 69; cockatiels is winning
Random # for budgies: 1 for cockatiels: 1
budgies 61, cockatiels 70; cockatiels is winning
Random # for budgies: 1 for cockatiels: 2
budgies 62, cockatiels 72; cockatiels is winning
Random # for budgies: 2 for cockatiels: 1
budgies 64, cockatiels 73; cockatiels is winning
Random # for budgies: 3 for cockatiels: 2
budgies 67, cockatiels 75; cockatiels is winning
Random # for budgies: 2 for cockatiels: 2
budgies 69, cockatiels 77; cockatiels is winning
Random # for budgies: 3 for cockatiels: 2
budgies 72, cockatiels 79; cockatiels is winning
Random # for budgies: 1 for cockatiels: 1
budgies 73, cockatiels 80; cockatiels is winning
Random # for budgies: 3 for cockatiels: 1
budgies 76, cockatiels 81; cockatiels is winning
Random # for budgies: 3 for cockatiels: 1
budgies 79, cockatiels 82; cockatiels is winning
Random # for budgies: 1 for cockatiels: 3
budgies 80, cockatiels 85; cockatiels is winning
Random # for budgies: 3 for cockatiels: 1
budgies 83, cockatiels 86; cockatiels is winning
Random # for budgies: 1 for cockatiels: 2
budgies 84, cockatiels 88; cockatiels is winning
Random # for budgies: 3 for cockatiels: 2
budgies 87, cockatiels 90; cockatiels is winning
Random # for budgies: 2 for cockatiels: 1
budgies 89, cockatiels 91; cockatiels is winning
Random # for budgies: 2 for cockatiels: 3
budgies 91, cockatiels 94; cockatiels is winning
Random # for budgies: 3 for cockatiels: 1
budgies 94, cockatiels 95; cockatiels is winning
Random # for budgies: 1 for cockatiels: 2
budgies 95, cockatiels 97; cockatiels is winning
Random # for budgies: 3 for cockatiels: 3
budgies 98, cockatiels 100; cockatiels is winning
budgies 98, cockatiels 100; cockatiels is the winner
 */
