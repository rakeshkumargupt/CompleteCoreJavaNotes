import java.util.*;

public class StackDemo
{
  public static void main(String[] args) {
    Stack stack=new Stack();
    stack.push("a");
    stack.push("b");
    stack.push("c");
    stack.push("d");
    stack.push("e");
        
    System.out.println("The number poped out is " + stack.pop());
    System.out.println("The number poped out is " + stack.pop());
    System.out.println("The peek " + stack.peek());

    System.out.println("The number poped out is " + stack.pop());
    }
}