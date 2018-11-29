/**
 * This class implements PairStackInterface as a stack that contains GraphPairs.
 *
 * @author Christopher Pucko <cgpucko@gmail.com>
 */

public class PairStack implements PairStackInterface {
    int top;
    GraphPair stack[];

    public PairStack(int size) {
        stack = new GraphPair[size];
        top = -1;
    }

    /**
     * This method removes the first entry from the stack.
     */
    public void pop() {
        stack[top] = null;
        top--;
    }

    /**
     * This returns the object on the top of the stack without removing it.
     *
     * @return GraphPairs -Returns a object with a cartesian pair and a direction.
     */
    public GraphPair top() {
        return stack[top];
    }

    /**
     * This pushes a GraphPair object to the stack.
     *
     * @param pair A GraphPair object containing 2 position integers and a direction double.
     */
    public void push(GraphPair pair) {
        top++;
        stack[top] = pair;

    }

    /**
     * This method checks if the stack is full, and returns true if there is no room on the stack.
     *
     * @return boolean True if there are no more spaces left in the stack.
     */
    public boolean IsFull() {
        if (top == stack.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method checks if there are no objects in the stack.
     *
     * @return boolean True if the stack has no contents indexed.
     */
    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }


    }}