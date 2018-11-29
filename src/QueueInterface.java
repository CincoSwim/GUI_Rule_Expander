/**
 * This is an interface for a Queue that holds single characters.
 *
 * @author Christopher Pucko
 */
public interface QueueInterface {


    char dequeue();

    void enqueue(char addChar);

    char peek();

    void printAll();



}

