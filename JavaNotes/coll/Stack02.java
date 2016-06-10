import java.util.*;

public class Stack02{
  public static void main(String[] args) {

    Stack<Integer>stack=new Stack<Integer>();
	int x=10;
    stack.push(x);
    stack.push(5);
    stack.push(7);
    stack.push(8);
    System.out.println("The contents of Stack is" + stack);
    System.out.println("The size of an Stack is" + stack.size());
    System.out.println("The number poped out is" + stack.pop());
    System.out.println("The number poped out is " + stack.pop());
    //System.out.println("The number poped out is" + stack.pop());
    System.out.println("The contents of stack is" + stack);
    System.out.println("The size of an stack is" + stack.size());
  }
}

