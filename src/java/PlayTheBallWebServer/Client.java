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
public class Client implements Serializable{
    
    private String clientID = "";
    private int numResults = 0;

    /**
     * @return the clientID
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * @param clientID the clientID to set
     */
    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    /**
     * @return the numResults
     */
    public int getNumResults() {
        return numResults;
    }

    /**
     * @param numResults the numResults to set
     */
    public void setNumResults(int numResults) {
        this.numResults = numResults;
    }
    
}
