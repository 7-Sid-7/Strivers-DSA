import java.util.*;

public class Medium02{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] nums=new int[n];
       for(int i=0;i<n;i++){
           nums[i]=in.nextInt();
       }
       System.out.println(Arrays.toString(sort012(nums)));
      s012(nums);
    }
    static int[] sort012(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if (map.get(count) >0) {
                arr[i] = count;
                map.put(count, map.get(count) - 1);
            } else{
                count++;
                i--;
            }
        }
        return arr;
    }
    static void s012(int[] nums) {
        int l = 0;
        int h = nums.length - 1;
        for (int i = l; i <= h; i++) {
            if (nums[i] == 0) {
                swap(nums, i, l);
                l++;
            } else if (nums[i] == 2) {
                swap(nums, i, h);
                h--;
                i--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
