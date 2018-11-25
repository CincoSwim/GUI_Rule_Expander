public interface QueueInterface {
    /**
 * This is a stack interface for a Queue to hold characters making the rule.
 *
 * @author Christopher Pucko <cgpucko@gmail.com>
 */

    char dequeue();

    void enqueue(char addChar);

    char peek();

    void printAll();



}

