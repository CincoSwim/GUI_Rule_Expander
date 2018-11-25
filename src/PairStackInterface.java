/**
 * This is a stack interface for a Stack to hold objects known as Couples.
 *
 * @author Christopher Pucko <cgpucko@gmail.com>
 */


public interface PairStackInterface {
    void pop();

    GraphPair top();

    void push(GraphPair pair);

    boolean IsFull();

    boolean IsEmpty();
}