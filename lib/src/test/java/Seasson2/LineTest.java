package Seasson2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import Seasson2.Line;
import org.junit.jupiter.api.Test;

public class LineTest {
  @Test
  public void test1() {
    String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
    int n = 92;
    assertEquals("Leonard", new Line().WhoIsNext(names, n));
  }
  @Test
  public void test2() {
    String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
    int n = 1;
    assertEquals("Sheldon", new Line().WhoIsNext(names, n));
  }

  @Test
  public void testN16() {
    String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
    int n = 16;
    assertEquals("Sheldon", new Line().WhoIsNext(names, n));
  }

  @Test
  public void test3(){
    String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
    int n = 52;
    assertEquals("Penny", new Line().WhoIsNext(names, n));
  }

}
