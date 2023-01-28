public class Main {
    public static void main(String[] args) {
        String playerName = "Ervin";

        int playerScore = calculateHighScorePosition(1500);
        displayHighScorePosition(playerName,playerScore);

        playerScore = calculateHighScorePosition(500);
        displayHighScorePosition(playerName,playerScore);

        playerScore = calculateHighScorePosition(100);
        displayHighScorePosition(playerName,playerScore);

        playerScore = calculateHighScorePosition(25);
        displayHighScorePosition(playerName,playerScore);

        playerScore = calculateHighScorePosition(1000);
        displayHighScorePosition(playerName,playerScore);
    }

    public static void displayHighScorePosition(String pName, int pPosition){
        System.out.println(pName + " managed to get into " + pPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int pScore) {
        if (pScore >= 1500) {
            return 1;
        } else if (pScore >= 500) {
            return 2;
        } else if (pScore >= 100) {
            return 3;
        }
        return 4;
    }
}
