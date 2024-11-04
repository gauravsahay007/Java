import java.util.*;
    
public class Lower_Upper_Bound {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 2,2, 3, 5);

        int lower = LowerBound(list,2);

        int upper = UpperBound(list,2);

        System.out.println(lower);
        System.out.println(upper);
        
        
    }

    public static int UpperBound(ArrayList<Integer> list, int target){
        int low = 0, high = list.size();
        int ans = 0;
        while(low <= high){
            int mid = (low + high)/2;

            if(list.get(mid) > target){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int LowerBound(ArrayList<Integer>list,int target){
        int low = 0, high = list.size();
        int ans = 0;
        while(low <= high){
            int mid = (low + high)/2;

            if(list.get(mid) < target){
                ans = mid + 1;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
    
}