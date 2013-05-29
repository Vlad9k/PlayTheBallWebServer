/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PlayTheBallWebServer;

import java.io.Serializable;

/**
 *
 * @author ragulin
 */
public class GameResult implements Serializable{
    private String leftScore = "0";
    private String rightScore = "0";
    private String playerName = "testPlayerName";
    private String playerComments = "testPlayerComments";
    public GameResult(){
        
    }

    /**
     * @return the leftScore
     */
    public String getLeftScore() {
        return leftScore;
    }

    /**
     * @param leftScore the leftScore to set
     */
    public void setLeftScore(String leftScore) {
        this.leftScore = leftScore;
    }

    /**
     * @return the rightScore
     */
    public String getRightScore() {
        return rightScore;
    }

    /**
     * @param rightScore the rightScore to set
     */
    public void setRightScore(String rightScore) {
        this.rightScore = rightScore;
    }

    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * @return the playerComments
     */
    public String getPlayerComments() {
        return playerComments;
    }

    /**
     * @param playerComments the playerComments to set
     */
    public void setPlayerComments(String playerComments) {
        this.playerComments = playerComments;
    }
    
}
