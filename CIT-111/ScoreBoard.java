/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lastweek;

/**
 *
 * @author julie.kurtzman
 */
public class ScoreBoard {

    public String team;
    public String team2;
    private int score;
    public int score2;
    public int timeLeft;
    public int currentQuarter;
    private final int TOTAL_TIME = 60;

    ScoreBoard(String homeSteelers, String awayName, int pointScored, int pointScored2, int time) {
        team = homeSteelers;
        team2 = awayName;
        score = pointScored;
        score2 = pointScored2;
        timeLeft = TOTAL_TIME - time;
        currentQuarter = 1;
    }
    
    public int getScore() {
        return score;
    }
    
    public void setScore(int newScore) {
        score = newScore;
    }

    public int getQuarter() {
        return currentQuarter;
    }

    public void setQuarter(int newQuarter) {
        currentQuarter = newQuarter;
    }

    public String getInfo() {
        String scoreInfo;
        scoreInfo = "Team Name: " + team + "      Team Name: " + team2
                + "\n    Score: " + score + "             Score: " + score2
                + "\n              Time Remaining: " + timeLeft
                + "\n           Quarter : " + currentQuarter;

        return scoreInfo;
    }
} // close ScoreBoard
