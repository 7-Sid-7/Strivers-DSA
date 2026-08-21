import java.util.*;

public class Easy11{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] nums=new int[n];
       for(int i=0;i<n;i++){
           nums[i]=in.nextInt();
       }
       System.out.println(maxones(nums)));
    }
    static int maxones(int[] arr){
        int count=0;
        int max=0;
        for(int i:arr){
            if(i==1){
                count++;
            }else{
                count=0;
            }
            max=Math.max(count,max);
        }
        return max;
    }
}
