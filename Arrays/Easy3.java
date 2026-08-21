import java.util.*;

public class Easy3{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] nums=new int[n];
       for(int i=0;i<n;i++){
           nums[i]=in.nextInt();
       }
       System.out.println(orderedarr(nums));
    }
  static boolean orderedarr(int[] arr){
        if(arr.length<2){
            return false;
        }
        boolean st1=false;
        boolean st2=false;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                st1=true;
            }
            if(arr[i-1]>arr[i]){
                st2=true;
            }
        }
        if(st1&st2){
            return false;

        }
        return st1|st2;
    }
}
