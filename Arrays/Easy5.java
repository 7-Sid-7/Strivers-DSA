import java.util.*;

public class Easy5{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] nums=new int[n];
       for(int i=0;i<n;i++){
           nums[i]=in.nextInt();
       }
       System.out.println(Arrays.toString(singleleft(nums)));
    }
  static int[] singleleft(int[] arr){
        if(arr.length<2){
            return new int[]{-1};
        }
        int key=arr[0];
        int n=arr.length-1;
        for(int i=1;i<=n;i++){
            arr[i-1]=arr[i];
        }
        arr[n]=key;
        return arr;
    }
}
