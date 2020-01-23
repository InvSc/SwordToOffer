package solutions.Nowcoder;

public class FibonacciArray {
  public int Fibonacci(int n) {
    if (n == 0) {
      return 0;
    }

    if (n == 1) {
      return 1;
    }
    if (n == 2) {
      return 1;
    }
    if (n > 2) {
      return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
    return -1;
  }

  public static void main(String[] args) {
    FibonacciArray fibonacciArray = new FibonacciArray();
    for(int i = 0; i < 40; i++) {
      System.out.println(fibonacciArray.Fibonacci(i));
    }
  }
}
