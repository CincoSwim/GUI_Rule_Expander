import java.util.ArrayDeque;

/**
 * This class implements a Queue using ArrayDeque and QueueInterface to hold single characters.
 *
 * @author Christopher Pucko
 *
 *
 */
public class Queue implements QueueInterface {
    ArrayDeque queue;
    public Queue(){
        queue = new ArrayDeque<Character>();

    }

    /**
     * This method adds a character to the end of the queue.
     * @param addChar - Character to be added to the queue.
     */
    public void enqueue(char addChar){
        queue.add(addChar);
    }

    /**
     * This returns the character at the start of the queue as a character, and removes it from the queue.
     * @return Char head - the entry at the start of the queue, passed as a character.
     */
    public char dequeue(){
        String entry = queue.pollFirst().toString();
        Character head = entry.charAt(0);

        return head;
    }

    /**
     * This returns the character at the start of the queue without removing it.
     * @return Char head - the entry at the start of the queue, passed as a character.
     *
     */
    public char peek(){
        String entry = queue.peekFirst().toString();
        Character head = entry.charAt(0);


        return head;
    }

    /**
     * This method prints the contents of the queue to the console, for testing purposes.
     */
    public void printAll(){
        ArrayDeque PrintQueue = new ArrayDeque<Character>();
        PrintQueue = queue.clone();
        while(PrintQueue.peek() != null)
            System.out.print(PrintQueue.pollFirst());
    }




}
