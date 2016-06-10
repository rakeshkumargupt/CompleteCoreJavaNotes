import java.util.*;

public class Stack01{
  public static void main(String[] args) {
    Stack stack=new Stack();
	int x=10;
    stack.push(x);
    stack.push("a");
    stack.push("b");
    stack.push("c");
    System.out.println("The contents of Stack is" + stack);
    System.out.println("The size of an Stack is" + stack.size());
    System.out.println("The number poped out is" + stack.pop());
    System.out.println("The number poped out is " + stack.pop());
    //System.out.println("The number poped out is" + stack.pop());
    System.out.println("The contents of stack is" + stack);
    System.out.println("The size of an stack is" + stack.size());
  }
}

