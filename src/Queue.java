import java.util.ArrayDeque;

public class Queue implements QueueInterface {
    ArrayDeque queue;
    public Queue(){
        queue = new ArrayDeque<Character>();

    }


    public void enqueue(char addChar){
        queue.add(addChar);
    }

    public char dequeue(){
        String entry = queue.pollFirst().toString();
        Character head = entry.charAt(0);

        return head;
    }

    public char peek(){
        String entry = queue.peekFirst().toString();
        Character head = entry.charAt(0);


        return head;
    }

    public void printAll(){
        ArrayDeque PrintQueue = new ArrayDeque<Character>();
        PrintQueue = queue.clone();
        while(PrintQueue.peek() != null)
            System.out.print(PrintQueue.pollFirst());
    }




}
