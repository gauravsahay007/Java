package stream_api;
import java.util.*;
import java.util.stream.*;
public class MakingStream {
    public static void main(String[] args){
        //From Collections
        List<Integer> list = List.of(1,2,3,4,5);
        Stream<Integer> stream1 = list.stream();

        //From Arrays
        String[] names = {"Alice","Bob","Charlie"};
        Stream<String> stream2 = Stream.of(names);

        //Using Stream.of()
        Stream<Integer> stream3 = Stream.of(1,43,53,2);

        Stream.of("1", "2", "a", "4")
      .map(number -> {
          try {
              return Integer.parseInt(number);  // Might throw NumberFormatException
          } catch (NumberFormatException e) {
              return 0;  // Default value on exception
          }
      })
      .forEach(System.out::println);

    }
}

/* Aspect	Streams	Collections
Nature	Streams are computed on-demand.	Collections store data in memory.
Modification	Streams are immutable (do not modify original data).	Collections are mutable.
Operations	Supports functional operations like map, filter, reduce.	Requires explicit iteration using loops or iterators.
Processing	Supports parallel processing.	Sequential only by default.
Consumption	Can only be traversed once.	Can be traversed multiple times. */