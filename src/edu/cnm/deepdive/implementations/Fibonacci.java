/**
 * 
 */
package edu.cnm.deepdive.implementations;

import java.math.BigInteger;
import java.util.Iterator;

/**
 * @author itajan
 *
 */
public class Fibonacci implements Iterable<BigInteger> {
  
  private static final int DEFAULT_UPPER = -1;
  
  private final int upper;
  
  public Fibonacci() {
    this(DEFAULT_UPPER);
  }
    public Fibonacci(int upper) {
      this.upper = upper;
  }
    
  @Override
  public Iterator<BigInteger> iterator() {
    // return new FibIterator();
    // Anonymous class implementing the Iterator<BigInteger> interface.
    return new Iterator<BigInteger> () {
      private BigInteger previous = BigInteger.valueOf(-1);
      private BigInteger current = BigInteger.ONE;
      private int index = 0;
      
      @Override
      public boolean hasNext() {
        return (upper < 0 || index < upper); // "||" short circuit version of "or", "&&" short circuit version of "&"
      }

      @Override
      public BigInteger next() {
        BigInteger next = previous.add(current);
        previous = current;
        current = next;
        index++;
        return current;
      }

      
    };
  }
  
//  private class FibIterator implements Iterator<BigInteger> { // inner class: can access the non-static fields of the enclosing class

//    Inner class implementing the Iterator<BigInteger> interface.
//    private BigInteger previous = BigInteger.valueOf(-1);
//    private BigInteger current = BigInteger.ONE;
//    private int index = 0;
//    
//    @Override
//    public boolean hasNext() {
//      return (upper < 0 || index < upper); // "||" short circuit version of "or" 
//    }
//
//    @Override
//    public BigInteger next() {
//      BigInteger next = previous.add(current);
//      previous = current;
//      current = next;
//      index++;
//      return current;
//    }
    
    
//  }
}
