import java.util.*;

public class Medium04{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] nums=new int[n];
       for(int i=0;i<n;i++){
           nums[i]=in.nextInt();
       }
       System.out.println(kadane(nums));
    }
    static int kadane(int[] arr){
        int m=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            m=Math.max(sum,m);
        }
        return m;
    }
}
