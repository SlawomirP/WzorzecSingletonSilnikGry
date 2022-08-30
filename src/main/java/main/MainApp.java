package main;

import logic.GuessGame;

public class MainApp {
    public static void main(String[] args) {
        GuessGame game = GuessGame.getInstance();
        game.play();

        int score = game.getScore();
        GuessGame anotherGameReference = GuessGame.getInstance();

        if (game == anotherGameReference) {
            System.out.println("Singleton!");
            if (score == anotherGameReference.getScore()) {
                System.out.println("I punkty się zgadzają!");

            }
        }
    }
}
