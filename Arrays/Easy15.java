import java.util.*;

public class Easy15{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] nums=new int[n];
       for(int i=0;i<n;i++){
           nums[i]=in.nextInt();
       }
       System.out.printlnsortedifrot(nums));
    }
    static boolean sortedifrot(int[] arr) {
        int c1=0;
        int c2=0;
        boolean st1=false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                c1++;
            }else if(arr[i]>arr[i+1]){
                c2++;
            }
        }
        if(c2>0){
            if(c2==1&&arr[0]>=arr[arr.length-1]) {
                st1 = true;
            }
        }else{
            st1=true;
        }
        boolean st2=(c1>=arr.length-2);
        return st1&&st2;
    }
}
