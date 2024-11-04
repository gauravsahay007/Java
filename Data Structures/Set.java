import java.util.*;

public class Set{
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3); //st.insert(3)
        set.remove(2); //st.erase(2)
        System.out.println(set);
    }
}