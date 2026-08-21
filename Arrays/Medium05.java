import java.util.*;

public class Medium05{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] nums=new int[n];
       for(int i=0;i<n;i++){
           nums[i]=in.nextInt();
       }
       System.out.println(stocks(nums));
    }
    static int stocks(int[] arr){
        int m=0;
        int l=0;
        for(int i=0;i<arr.length;i++){
            if(arr[l]>arr[i]){
                l=i;
            }
            else if(arr[i]>arr[l]){
                m=Math.max(m,arr[i]-arr[l]);
            }
        }
        return m;
    }
}
