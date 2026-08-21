import java.util.*;

public class Medium06{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] nums=new int[n];
       for(int i=0;i<n;i++){
           nums[i]=in.nextInt();
       }
       System.out.println(Arrays.toString(pnp(nums)));
    }
    static int[] pnp(int[] arr){
        int even=0;
        int odd=1;
        int[] arr1=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0&&even<=arr.length){
                arr1[even]=arr[i];
                even+=2;
            }else if(arr[i]<0&&odd<=arr.length){
                arr1[odd]=arr[i];
                odd+=2;
            }
        }
        return arr1;
    }
}
