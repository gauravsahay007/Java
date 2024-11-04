package stream_api;
import java.util.*;
import java.util.stream.*;

public class StreamMain1 {
    public static void main(String[] args){
         //Q) Create a list and filter all even numbers from list
         ArrayList<Integer> integers = new ArrayList<>();
         Collections.addAll(integers,2,4,50,21,22,67);

         ArrayList<Integer> listEven = new ArrayList<>();
        
         for(Integer i : integers){
            if(i%2 == 0){
                listEven.add(i);
            }
         }
         System.out.println(integers);
         
         System.out.println(listEven);

        //using stream api
        Stream<Integer> stream = integers.stream();

        ArrayList<Integer> newList = stream.filter(i -> i%2 == 0).collect(Collectors.toCollection(ArrayList::new));

        System.out.println(newList);

        ArrayList<Integer> greaterList = integers.stream().filter(i -> i > 10).collect(Collectors.toCollection(ArrayList::new));
         
        System.out.println(greaterList);

        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr,2,3,4,5);
        Stream<Integer> stream2 = arr.stream();

        ArrayList<Integer> newArr = stream2.map(i -> i*i).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(newArr);

        arr.stream().sorted().forEach(i -> {
            System.out.println(i + ":" + i*i);
            
        });
        
    }
}
