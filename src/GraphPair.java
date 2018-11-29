/**
 * This class creates an object called Couples, which acts as a pair of 2 index intergers.
 *
 * @author Christopher Pucko <cgpucko@gmail.com>
 */

public class GraphPair {
    int x, y;
    double direction;

    /**
     * A GraphPair object is used to save a cartesian position in 'DrawingCanvas.java'
     * @param x - The x position of the drawing brush
     * @param y - The y position of the drawing brush
     * @param direction - The angular direction of the drawing brush.
     */
    public GraphPair(int x, int y, double direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getPartner1() {
        return x;
    }

    public void setPartner1(int x) {
        this.x = x;
    }

    public int getPartner2() {
        return y;
    }

    public void setPartner2(int y) {
        this.y = y;
    }
}