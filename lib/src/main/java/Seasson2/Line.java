package Seasson2;

/**
 * Sheldon, Leonard, Penny, Rajesh and Howard are in the queue for a "Double Cola" drink vending
 * machine; there are no other people in the queue. The first one in the queue (Sheldon) buys a can,
 * drinks it and doubles! The resulting two Sheldons go to the end of the queue. Then the next in
 * the queue (Leonard) buys a can, drinks it and gets to the end of the queue as two Leonards, and
 * so on.
 *
 * For example, Penny drinks the third can of cola and the queue will look like this:
 *
 *      Rajesh, Howard, Sheldon, Sheldon, Leonard, Leonard, Penny, Penny
 *
 * Write a program that will return the name of the person who will drink the n-th cola.
 *
 * https://www.codewars.com/kata/551dd1f424b7a4cdae0001f0
 */

public class Line {
  public static String WhoIsNext(String[] names, int n){
    int index = n - 1;
    while(names.length <= index){
      int div = index - names.length;
      index = (int) Math.floor(div/2);
    }
    return names[index];
  }

}
