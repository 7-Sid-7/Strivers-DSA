import java.util.*;

public class Medium03{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] nums=new int[n];
       for(int i=0;i<n;i++){
           nums[i]=in.nextInt();
       }
       System.out.println(majelement(nums));
    }
    static int majelement(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0;
        int ans=0;
        for(int i:map.keySet()) {
            if (map.get(i) > max) {
                max = map.get(i);
                ans = i;
            }
        }
        return ans;
    }
}
