import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    // Stack = LIFO data structure. Last In, First Out
    // stores objects into a sort of 'vertical tower'
    // push() to add to the top
    // pop() to remove from the top

    Stack<String> stack = new Stack<String>();

    System.out.println("is stack empty? : " + stack.empty());

    System.out.println("Pushing five games to the stack.");
    stack.push("Minecraft");
    stack.push("Skyrim");
    stack.push("Doom");
    stack.push("Borderlands");
    stack.push("FFVII");

    System.out.println("is stack empty now? : " + stack.empty());

    System.out.println("stack: " + stack);

    System.out.println("Popping a game from the stack.");
    String myFavoriteGame = stack.pop();
    System.out.println("stack: " + stack);

    System.out.println("popping returns the object");
    System.out.println("and allows you to store it in a variable");
    System.out.println("my favorite game: " + myFavoriteGame);

    // uses of stacks?
    // 1. Undo/Redo features
    // 2. moving backward/forward through browswer history
    // 3. backtracking algorithms (maze, file dictionary)
    // 4. calling functions

  }
}
