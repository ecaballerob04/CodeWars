package Seasson2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class KataTest {

  @Test
  public void exampleTest() {

    int[][] a = {
      {1, 2},
      {3, 2}
    };

    int[][] b = {
      {3, 2},
      {1, 1}
    };

    int[][] expected = {
      {5, 4},
      {11, 8}
    };

    int[][] actual = Kata.matrixMultiplication(a, b);
    assertArrayEquals(expected, actual);
  }
}