package com.navishkakularathna;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelsCompleted = 5;
        int bonus = 100;

        CalculateScore(gameOver, score, levelsCompleted, bonus);
    }

    public static void CalculateScore(boolean gameOver, int score, int levelsCompleted, int bonus){
        if(gameOver){
            int finalScore = score + (levelsCompleted*bonus);
            finalScore += 2000;
            System.out.println("Your final score is: " + finalScore);
        }
    }
}
