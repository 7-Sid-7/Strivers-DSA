import java.util.*;

public class Easy2{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] nums=new int[n];
       for(int i=0;i<n;i++){
           nums[i]=in.nextInt();
       }
       SSandL(nums);
    }
static void SSandL(int[] arr){
        if(arr.length<2) {
            int sl = -1;
            int ss = -1;
            System.out.println("sec largest: " + sl + " sec smallest: " + ss);
            return;
        }
        int s=arr[0];
        int ss=arr[1];
        int l=arr[0];
        int sl=arr[1];

        for(int i=1;i<arr.length;i++){
            if(arr[i]<s){
                ss=s;
                s=arr[i];
            }
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }
        }
        if(s>sl){
            int temp=s;
            s=ss;
            ss=temp;
        }else if(ss==s){
            ss=-1;
        }
        if(l<sl){
            int temp=l;
            l=sl;
            sl=temp;
        }else if(l==sl){
            sl=-1;
        }
        System.out.println("sec largest: "+sl+" sec smallest: "+ss);
    }
}
