import java.util.*;

public class Medium01{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] nums=new int[n];
       for(int i=0;i<n;i++){
           nums[i]=in.nextInt();
       }
       System.out.println(Arrays.toString(tgtsum(arr)));
    }
    static int[] tgtsum(int[] arr,int tgt){
        int l=0;
        for(int i=l+1;i<arr.length;i++){
            if(arr[l]+arr[i]==tgt){
                return new int[]{l,i};
            }
            l++;
            i=l+1;
        }
        return new int[]{-1,-1};
    }
}
