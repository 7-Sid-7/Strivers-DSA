import java.util.*;

public class Medium07{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] nums=new int[n];
       for(int i=0;i<n;i++){
           nums[i]=in.nextInt();
       }
       System.out.println(Arrays.toString(nextperm(nums)));
    }
    static int[] nextperm(int[] arr){
        int x=0;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                x=i;
                break;
            }
        }
        if(x==0){
            rev(arr,0,arr.length-1);
        }else if(x==1){
            rev(arr,1,arr.length-1);
            for(int i=1;i<arr.length;i++){
                if(arr[i]>arr[0]){
                    swap(arr,i,0);
                    break;
                }
            }
        }else{
            int m=0;
            for(int i=arr.length-1;i>x;i--){
                if(arr[i]>arr[x-1]){
                    m=i;
                    break;
                }
            }
            swap(arr,m,x-1);
            rev(arr,x,arr.length-1);
        }
        return arr;
    }
}
