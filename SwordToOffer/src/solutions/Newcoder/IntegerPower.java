package solutions.Newcoder;

public class IntegerPower {
  public double Power(double base, int exponent) {
    if(exponent==0) {
      return 1;
    }
    if(base == 0){
      return 0;
    }
    if(exponent<=0){
      return 1/easyPower(base,-exponent);
    }
    else return easyPower(base,exponent);
  }

  public double easyPower(double base, int exponent) {
    double output = 1;
    for(int i=1; i<=exponent; i++){
      output = output * base;
    }
    return output;
  }

  public static void main(String[] args) {
    IntegerPower integerPower = new IntegerPower();
    System.out.println(integerPower.Power(0, 1));
//    静态方法在访问本类的成员时，只允许访问静态成员（即静态成员变量和静态方法），而不允许访问实例成员变量和实例方法；实例方法则无此限制。
//    System.out.println(easyPower(2, 4));
  }
}