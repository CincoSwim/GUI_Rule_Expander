/**
 * This class creates an object called Couples, which acts as a pair of 2 index intergers.
 *
 * @author Christopher Pucko <cgpucko@gmail.com>
 */

public class GraphPair {
    int x, y;
    double direction;

    public GraphPair(int x, int y, double direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getPartner1() {
        return x;
    }

    public void setPartner1(int partner1) {
        this.x = partner1;
    }

    public int getPartner2() {
        return y;
    }

    public void setPartner2(int partner2) {
        this.y = partner2;
    }
}