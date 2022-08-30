package logic;

import java.util.Scanner;

public class GuessGame {

    private static GuessGame instance;
    private int score;
    private int actualAtempt = 0;
    private Scanner scanner;

    private GuessGame() {
        this.score = 0;
        this.scanner = new Scanner(System.in);
    }

    public void play(){
        int attempt = 5;
        while(actualAtempt < attempt){

            int numberToGuess = RandomNumberGenerator.randomNumber();

            System.out.println("Try to guess number");

            int userNumber = scanner.nextInt();

            if(userNumber == numberToGuess){
                score++;
            }

            System.out.println(numberToGuess);
            actualAtempt++;
        }
    }

    public int getScore(){
        return this.score;
    }

    public static GuessGame getInstance(){
        if(instance == null){
            synchronized (GuessGame.class){
                if(instance == null) {
                    instance = new GuessGame();
                }
            }
        }
        return instance;
    }
}
