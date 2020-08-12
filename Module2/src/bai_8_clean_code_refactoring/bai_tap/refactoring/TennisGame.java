package bai_8_clean_code_refactoring.bai_tap.refactoring;

public class TennisGame {

    public static final int ZERO = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;
    public static final String DASH = "-";

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        boolean isEqual = player1Score == player2Score;
        boolean isCompare = (player1Score >= 4 || player2Score >= 4);
        String score = "";

        if (isEqual) { return getScorePlayer(player1Score); }
        else if (isCompare) { return getAdvantage(player1Score, player2Score); }
        else { return getPrintCalculator(player1Score, player2Score, score); }
    }

    // Trường hợp bằng nhau
    public static String getScorePlayer(int player1Score) {
        switch (player1Score) {
            case ZERO:
                return "Love-All";
            case FIFTEEN:
                return "Fifteen-All";
            case THIRTY:
                return "Thirty-All";
            case FORTY:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    // Tính ưu tiên và ai thắng
    public static String getAdvantage(int player1Score, int player2Score) {
        int minusResult = player1Score - player2Score;

        boolean player1Advantage = minusResult == 1;
        boolean player2Advantage = minusResult == -1;
        boolean player1 = minusResult >= 2;

        if (player1Advantage) return "Advantage player1";
        else if (player2Advantage) return "Advantage player2";
        else if (player1) return "Win for player1";
        else return "Win for player2";
    }

    // In ra kết quả điểm mỗi người chơi
    public static String getPrintCalculator(int player1Score, int player2Score, String score) {
        score = getCalculatorScorePlayer(player1Score);
        score += DASH;
        score += getCalculatorScorePlayer(player2Score);
        return score;
    }

    // Tính điểm
    public static String getCalculatorScorePlayer(int playerScore) {
        switch (playerScore) {
            case ZERO:
                return "Love";
            case FIFTEEN:
                return "Fifteen";
            case THIRTY:
                return "Thirty";
            default:
                return "Forty";
        }
    }
}

