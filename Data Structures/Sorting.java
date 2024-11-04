import java.util.*;

public class Sorting{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(); //vector<int>arr
        arr.add(1); //arr.push_back(1);
        arr.add(42); //arr.push_back(32);
        arr.add(2);
        arr.add(-1);
        arr.add(-10);

        System.out.println(arr); 

        Collections.sort(arr);//sort(arr.begin(),arr.end());

        System.out.println(arr);
    }
}