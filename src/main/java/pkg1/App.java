package pkg1;

import java.util.Arrays;

public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello world!");
    System.out.printf("String[] args = %s\n", Arrays.toString(args));
    System.out.printf("method1(2, 3) = %s\n", Code.method1(2, 3));
    System.out.printf("method2(2, 3) = %s\n", Code.method2(2, 3));
  }
}
