package solutions.Nowcoder;

import java.util.Stack;

public class QueueImplement {
  Stack<Integer> stack1 = new Stack<Integer>();
  Stack<Integer> stack2 = new Stack<Integer>();

  public void push(int node) {
    stack1.push(node);
  }

  // poul integers from stack1 to stack2
  public void poul(Stack<Integer> stack1, Stack<Integer> stack2) {
    while (!stack1.empty()) {
      stack2.push(stack1.pop());
    }
  }

  public int pop() {
    poul(stack1, stack2);
    Integer pop = stack2.pop();
    poul(stack2, stack1);
    return pop;
  }
}

