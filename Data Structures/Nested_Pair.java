import java.util.*;
    
public class Nested_Pair {
    
    public static void main(String[] args) {
        ArrayList<NestedPair> list = new ArrayList<>();

        list.add(new NestedPair(new Pair(2,3), 3));
        list.add(new NestedPair(new Pair(23,4), 1));

    

        for(NestedPair p : list){
            System.out.println(p.pair.first + " " + p.pair.second + " " + p.value );
            
        }
        
    }
    
}

class Pair{
    int first;
    int second;

    Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}

class NestedPair{
    Pair pair;
    int value;

    NestedPair(Pair pair,int value){
        this.pair = pair;
        this.value = value;
    }
}

