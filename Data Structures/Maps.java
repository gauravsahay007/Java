import java.util.*;

public class Maps{
    public static void main(String[] args){
        HashMap<Integer, String> mp = new HashMap<>(); //map<int,string> mp;
        mp.put(1,"One"); //mp[1] = "One"
        mp.put(2,"Two");
        mp.remove(1); //mp.erase(1);
        System.out.println(mp);
    }
}