import java.io.*;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class Main {
  public static void main(String args[]) throws UnsupportedEncodingException {
    Reader inputReader = new InputStreamReader(System.in, "UTF-8");
    BufferedReader reader = new BufferedReader(inputReader);
    Stream<String> stream = reader.lines();
    stream
      .map(String::toLowerCase)
      .map(s -> s.split("[\\p{Blank}\\p{Punct}]+"))
      .flatMap(Arrays::stream)
      .collect(groupingBy(Function.identity(), Collectors.counting()))
      .entrySet().stream()
      .sorted((e1, e2) -> {
        int comp = e2.getValue().compareTo(e1.getValue());
        if (comp == 0) {
          return -e2.getKey().compareTo(e1.getKey());
        }
        return comp;
      })
      .limit(10)
      .map(Map.Entry::getKey)
      .forEach(System.out::println);
  }
}
