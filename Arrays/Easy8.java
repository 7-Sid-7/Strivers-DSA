import java.util.*;

public class Easy8{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] nums=new int[n];
       for(int i=0;i<n;i++){
           nums[i]=in.nextInt();
       }
       System.out.println(linearsearch(nums));
    }
  static int linearsearch(int[] arr,int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
}
