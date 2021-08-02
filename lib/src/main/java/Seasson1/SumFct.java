package Seasson1;

import java.math.BigInteger;
import java.util.Arrays;

public class SumFct {

  public static BigInteger perimeter(BigInteger n) {

    return Arrays.stream(fib(n))
        .reduce(BigInteger.ZERO, BigInteger::add)
        .multiply(BigInteger.valueOf(4));
  }

  public static BigInteger[] fib(BigInteger n) {
    BigInteger [] cache = new BigInteger[n.add(BigInteger.ONE).intValue()];
    cache[0] = BigInteger.ONE;
    cache[1] = BigInteger.ONE;
    for(BigInteger i = BigInteger.TWO; i.compareTo(n.add(BigInteger.ONE)) < 0; i = i.add(BigInteger.ONE)){
      cache[i.intValue()] = cache[i.intValue() - 1].add(cache[i.intValue() - 2]);
    }
    return cache;
  }
}
