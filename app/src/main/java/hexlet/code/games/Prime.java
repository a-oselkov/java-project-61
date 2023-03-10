package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_ROUNDS;

public class Prime {
    private static final String PRIME_RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static String[] generateRoundQuestion() {
        String answer;
        String question;
        int number = Utils.generateRandomNumber(1, Utils.MAX_NUMBER);
        question = String.valueOf(number);
        answer = "yes";
        if (number == 1) {
            answer = "no";
        }
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                answer = "no";
                break;
            }
        }
        String[] questionAnswerRound = {question, answer};
        return questionAnswerRound;
    }
    private static String[][] generateGameQuestion() {
        String[][] questionAnswerGame = new String[MAX_ROUNDS][2];
        for (int i = 0; i < MAX_ROUNDS; i++) {
            questionAnswerGame[i] = generateRoundQuestion();
        }
        return questionAnswerGame;
    }
    public static void playPrime() {
        Engine.playGame(PRIME_RULES, generateGameQuestion());
    }
}
