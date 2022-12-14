/*
 * Town.java
 *
 * $LastChangedDate$
 * $LastChangedRevision$
 * Vicente J. Ferrer Dalmau
 * < vicente@jdalmau.es >
 *
 * Contains all the important information about a Town.
 */

package travelingsalesman;

/**
 *
 * @author Vicente J. Ferrer Dalmau
 */
public class Town {
    
    public int number;
    public int f, g, h;
    public int level;
    public Town parent = null;
    
    /** Creates a new instance of Town */
    public Town(int number, int g, int h, int level) {
    
        this.number = number;
        this.g = g;
        this.h = h;
        this.f = this.g + this.h;
        this.level = level;
    }
    
}
