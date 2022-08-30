package logic;

import java.util.Random;

public class RandomNumberGenerator {
    private static Random random = new Random();
    private final static int UPPER_BOUND = 9;

    public static int randomNumber(){
        return random.nextInt(UPPER_BOUND + 1);
    }
}
