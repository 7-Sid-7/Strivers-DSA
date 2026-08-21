import java.util.*;

public class Easy13{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
      int tgt=in.nextInt();
       int[] nums=new int[n];
       for(int i=0;i<n;i++){
           nums[i]=in.nextInt();
       }
       System.out.println(maxsum(nums,tgt));
    }
    static int maxsum(int[] arr,int k){
        int count=0;
        int l=0;
        int max=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            count++;
            while(sum>k){
                sum-=arr[l];
                l++;
                count--;
            }
            if(sum==k){
                max=Math.max(max,count);
            }
        }
        return max;
    }
}
