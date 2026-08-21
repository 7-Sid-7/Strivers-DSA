import java.util.*;

public class Easy9{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] nums=new int[n];
       for(int i=0;i<n;i++){
           nums[i]=in.nextInt();
       }
       System.out.println(Arrays.toString(union(nums)));
    }
    static int[] union(int[] arr1,int[] arr2){
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=Math.max(arr1.length,arr2.length);
        for(int i=0;i<max;i++) {
            if(i<arr1.length) {
                map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
            }
            if(i<arr2.length) {
                map.put(arr2[i],map.getOrDefault(arr2[i],0)+1);
            }
        }
        int[] ans=new int[map.size()];
        int j=0;
        for(int i: map.keySet()){
            ans[j]=i;
            j++;
        }
        return ans;
    }
}
