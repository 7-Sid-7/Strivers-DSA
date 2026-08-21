import java.util.*;

public class Easy7{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] nums=new int[n];
       for(int i=0;i<n;i++){
           nums[i]=in.nextInt();
       }
       System.out.println(Arrays.toString(zerosatend(nums)));
       System.out.println(Arrays.toString(zerosatend1(nums)));
    }
    static int[] zerosatend(int[] arr){
        int i=0;
        int count=0;
        while(i<=arr.length-1){
            if(arr[i]!=0) {
                arr[count] = arr[i];
                count++;
            }
            i++;
        }
        for(int j=count;j<arr.length;j++){
            arr[j]=0;
        }
        return arr;
    }
    static int[] zerosatend1(int[] arr){
        int z=-1;
        boolean st=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0&&st){
                st=false;
                z=i;
            }
            if(arr[i]!=0&&z>=0){
                int temp=arr[z];
                arr[z]=arr[i];
                arr[i]=temp;
                i=z;
                st=true;
            }
        }
        return arr;
    }
}
