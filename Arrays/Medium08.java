import java.util.*;

public class Medium08{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] nums=new int[n];
       for(int i=0;i<n;i++){
           nums[i]=in.nextInt();
       }
       System.out.println(Arrays.toString(leader(nums)));
    }
    static int[] leader(int[] arr){
        int lead=arr[arr.length-1];
        int count=1;
        int[] ans=new int[arr.length-1];
        ans[0]=lead;
        for(int i=0;i<arr.length;i++){
            if(arr[arr.length-1-i]>lead){
                lead=arr[arr.length-1-i];
                ans[count]=lead;
                count++;
            }
        }
        return ans;
    }
}
