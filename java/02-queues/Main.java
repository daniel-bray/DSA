import java.util.Queue;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {

    // Queue = FIFO data structure. First In First Out (ex. a line of people)
    // A collection designed for hholding elements prior to processing
    // Linear data structure

    // add = enqueue, offer()
    // remove = dequeue, poll()

    Queue<String> queue = new LinkedList<String>();

    queue.offer("Karen");
    queue.offer("Chad");
    queue.offer("Steve");
    queue.offer("Harold");

    System.out.println("peeking: " + queue.peek());

    System.out.println();
    System.out.println("Polling poll(): " + queue.poll());

    System.out.println();
    System.out.println("Peeking again: " + queue.peek());
    
    System.out.println(queue);

    // Where are queues useful?
    // 1. Keyboard Buffer (letters should appear on the screen in the order they are
    // pressed)
    // 2. Printer Queue (Print jobs should be completed in order)
    // 3. Used in LinkedLists, PriorityQueues, Breadth-first search
  }
}



  




  


  





  





  

  

  

  

  



