package Seasson2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class FactDecompTest {
  private static void testing(int n, String expected) {
    System.out.println("N: " + n);
    String actual = FactDecomp.decomp(n);
    assertEquals(expected, actual);
  }
  @Test
  public void test1() {
    testing(17, "2^15 * 3^6 * 5^3 * 7^2 * 11 * 13 * 17");
    testing(5, "2^3 * 3 * 5");
    testing(22, "2^19 * 3^9 * 5^4 * 7^3 * 11^2 * 13 * 17 * 19");
    testing(14, "2^11 * 3^5 * 5^2 * 7^2 * 11 * 13");
    testing(25, "2^22 * 3^10 * 5^6 * 7^3 * 11^2 * 13 * 17 * 19 * 23");
  }

  @Test
  public void getPrimesTest(){
    System.out.println(FactDecomp.getPrimes(17).stream().map(s -> s.toString()).collect(Collectors.joining(" ")));
  }

  @Test
  public void decompTest(){
    Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
    for(int i = 2; i <= 17; i++){
      FactDecomp.getPrimes(i).stream()
          .forEach(prime -> map.put(prime,
              map.containsKey(prime) ?
                  map.get(prime) + 1 : 1));

    }
    map.entrySet().stream()
        .forEach(entry -> System.out.println("Prime: " + entry.getKey()
            + " Times: " + entry.getValue()));
  }
}
