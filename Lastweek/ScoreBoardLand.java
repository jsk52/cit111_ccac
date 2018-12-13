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
public class ScoreBoardLand {

    public static void main(String[] args) {

        ScoreBoard scoreFinal = new ScoreBoard("Steelers", "Away", 14, 7, 35);

        String message;
        message = scoreFinal.getInfo();
        System.out.println(message);

    }//close main methdod
}//close ScoreBoardLand class
