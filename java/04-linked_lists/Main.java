import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> linkedList = new LinkedList<>();

    // LinkedList = Nodes are in 2 parts (data + address)
    // Nodes are in non-consecutive memory locations
    // Elements are linked using pointers

    // advantages?
    // 1. Dynamic Data Structure (allocates needed memory while running)
    // 2. Insertion and Delection of Nodes is easy. O(1)
    // 3. No/Low memory waste

    // disadvantages?
    // 1. Greater memory usage (additional pointer)
    // 2. No random access of elements (no idex[i])
    // 3. Accessing/searching elements is more time consuming. O(n)

    // uses?
    // 1. implement Stacks/Queues
    // 2. GPS Navigation
    // 3. music playlist

    // mimics stack
    // linkedList.push("A");
    // linkedList.push("B");
    // linkedList.push("C");
    // linkedList.push("D");
    // linkedList.push("F");
    // System.out.println(linkedList);
    // [F, D, C, B, A]

    // System.out.println("popped the linked list");
    // linkedList.pop();

    // mimics queue
    linkedList.offer("A");
    linkedList.offer("B");
    linkedList.offer("C");
    linkedList.offer("D");
    linkedList.offer("F");
    System.out.println(linkedList);
    // [A, B, C, D, F]

    // linkedList.poll();
    // System.out.println(linkedList);

    linkedList.add(4, "E");
    System.out.println(linkedList);

    System.out.println(".remov(e())ing E");
    linkedList.remove("E");
    System.out.println(linkedList);

    System.out.println("index of B: " + linkedList.indexOf("B"));

  }
}
