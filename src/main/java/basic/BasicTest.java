package basic;

import io.vavr.control.Option;

/**
 * For this basic test, you should not use any library. e.g. you should not use Math.pow for power method
 */
public class BasicTest {

  /**
   * return i ^ n for positive Integer, None otherwise
   * alse return None in case of errors
   */
  public static Option<Integer> power(Integer i, Integer n) {
    if (i == null || n == null || n < 0) {
      return Option.none();
    }
    
    if (n == 0) {
      return Option.some(1);
    }
  
    Long result = i.longValue();
    for (int j = 1; j < n; j++) {
      result *= i;
      if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
        return Option.none();
      }
    }
    return Option.some(result.intValue());
 }
}
