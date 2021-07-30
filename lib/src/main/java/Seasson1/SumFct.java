package Seasson1;

import java.math.BigInteger;
import java.util.Arrays;

public class SumFct {

  public static BigInteger perimeter(BigInteger n) {

    return Arrays.asList(fib(n)).stream().reduce(BigInteger.ZERO,BigInteger::add).multiply(BigInteger.valueOf(4));
  }

  private static BigInteger[] fib(final BigInteger n) {
    Long size = n.longValue();
    BigInteger [] cache = new BigInteger [size.intValue() + 1];

    cache[0] = BigInteger.ONE;
    cache[1] = BigInteger.ONE;

    for(int i = 2; i <= size.intValue(); i++){
      BigInteger fibValOne = cache[i-1];
      BigInteger fibValTwo = cache[i-2];
      cache[i] = fibValOne.add(fibValTwo);
    }

    return cache;
  }
}

