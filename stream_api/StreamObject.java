package stream_api;
import java.util.stream.*;
public class StreamObject {
    public static void main(String[] args) {
        //collection /group of object

        //Stream of Objects:
        Stream<Object> emptyStream = Stream.empty();
        
        String[] names = {"Gaurav", "Kothari", "Chandra", "Gupta"};

        Stream<String> stream1 = Stream.of(names);
        
        stream1.forEach(e -> {
            System.out.println(e);
        });


    }
    
}
