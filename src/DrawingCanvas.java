import java.awt.Canvas;
import java.awt.*;
import java.awt.geom.*;


/**
 * @author Gerald Heuring
 */
public class DrawingCanvas extends Canvas {
    protected String drawString;
    protected double angleIncrement;


    DrawingCanvas() {
        this.setPreferredSize(new Dimension(800, 600));
    }

    public void setDrawString(String s) {
        drawString = s;
    }

    public void setAngleIncrement(double d) {
        angleIncrement = Math.PI * d / 180.0;
    }

    /**
     * Paint routine for our canvas.  The upper Left hand corner
     * is 0, 0 and the lower right hand corner is 799, 599.
     * <p>
     * The initial position is set in the center of the canvas, at (400, 300)
     * <p>
     * When this method encounters an open bracket ([) it will save its current settings to a
     * stack of size 100. If the stack is full, it will disregard any more saved inputs until an input
     * is recalled.
     * <p>
     * If a closed bracket (]) is encountered, the saved position will be recalled. If the stack is empty, this
     * command will be disregarded.
     * </p>
     */
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        int currentPositionX, currentPositionY, position;
        double currentAngle;

        PairStack stack = new PairStack(100);

        currentPositionX = 400;
        currentPositionY = 300;
        currentAngle = 0.0;

        for (position = 0; position < drawString.length(); position++) {
            if (drawString.charAt(position) == 'F' ) { // Draw 5 units along current direction
                Line2D line = new Line2D.Double(currentPositionX, currentPositionY,
                        currentPositionX + 5.0 * Math.sin(currentAngle),
                        currentPositionY + 5.0 * Math.cos(currentAngle));
                g2.draw(line);
                currentPositionX = (int) (currentPositionX + 5.0 * Math.sin(currentAngle));
                currentPositionY = (int) (currentPositionY + 5.0 * Math.cos(currentAngle));
            } else if (drawString.charAt(position) == '-') {
                currentAngle -= angleIncrement;
            } else if (drawString.charAt(position) == '+') {
                currentAngle += angleIncrement;
            } else if (drawString.charAt(position) == '[') {
                if (!stack.IsFull()) {
                    stack.push(new GraphPair(currentPositionX, currentPositionY, currentAngle));
                } else {
                    System.out.println("Stack is full. Stack will keep most recent pair before being full");
                }

            } else if (drawString.charAt(position) == ']') {
                if (!stack.IsEmpty()) {
                    GraphPair savedPos = stack.top();
                    currentPositionX = savedPos.x;
                    currentPositionY = savedPos.y;
                    currentAngle = savedPos.direction;
                    stack.pop();
                }else{
                    System.out.println("Stack is empty. Current position will be used.");
                }
            }
        }
    }

}