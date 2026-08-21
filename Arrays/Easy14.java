import java.util.*;

public class Easy7{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] nums=new int[n];
       for(int i=0;i<n;i++){
           nums[i]=in.nextInt();
       }
       System.out.println(maxsumzero(nums));
    }
    static int maxsumzero(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            int sum=0;
            for(int j=i;j<arr.length;j++) {
                sum += arr[j];
                count++;
                if (sum == 0) {
                    max = Math.max(max, count);
                }
            }
        }
        return max;
    }
}
