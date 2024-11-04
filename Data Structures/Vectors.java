import java.util.*;

public class Vectors{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); //arr.push_back(1)
        list.add(2); //arr.push_back(2)
        list.add(3);
        list.add(3);
        list.remove(list.size()-1); //pop_back()
        System.out.println(list);
    }
}