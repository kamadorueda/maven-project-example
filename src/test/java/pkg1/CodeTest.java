package pkg1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CodeTest {
  @Test
  public void testMethod1() {
    assertEquals(Code.method1(2, 3), 5);
  }

  @Test
  public void testMethod2() {
    assertEquals(Code.method2(2, 3), 6);
  }
}
