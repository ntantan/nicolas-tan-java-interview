package collection;

import java.util.List;
import java.util.stream.Collectors;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {
  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {
    return input.stream()
        .map(i -> Math.pow(((i * 2) + 3), 5))
        .collect(Collectors.toList());
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {
    return input.stream()
        .map(i -> capitalize(i) + capitalize(i))
        .collect(Collectors.toList());
  }

  private static String capitalize(String str) {
    if (str == null || str.isEmpty()) {
      return "";
    }
    return str.substring(0, 1).toUpperCase().concat(str.substring(1));
  }
}
