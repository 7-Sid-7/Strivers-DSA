import java.util.*;

public class Easy6{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int a=in.nextInt();
       char b=in.next().charAt(0);
       int[] nums=new int[n];
       for(int i=0;i<n;i++){
           nums[i]=in.nextInt();
       }
       System.out.println(Arrays.toString(krotate(nums,a,b);
       System.out.println(Arrays.toString(krotate2(nums,a,b);
    }
  static int[] krotate(int[] arr,int k,char x){
        k=k%arr.length;
        for(int i=0;i<k;i++) {
            int n = arr.length - 1;
            if (x == 'l') {
                int key = arr[0];
                for (int j = 1; j <= n; j++) {
                    arr[j-1] = arr[j];
                }
                arr[n] = key;
            }else if(x=='r'){
                int key=arr[n];
                for(int j=n;j>0;j--){
                    arr[j]=arr[j-1];
                }
                arr[0]=key;
            }else{
                return new int[]{-1};
            }
        }
        return arr;
    }
    static int[] krotate2(int[] arr,int k,char x){
        arr=rev(arr,0,arr.length-1);
        if(x=='l'){
            arr=rev(arr,0,arr.length-1-k);
            arr=rev(arr,arr.length-k,arr.length-1);
            return arr;
        }if(x=='r'){
            arr=rev(arr,0,k-1);
            arr=rev(arr,k,arr.length-1);
            return arr;
        }
        return new int[]{-1};
    }
    static int[]  rev(int[] arr,int st,int en){
        while(st<en){
            int temp=arr[st];
            arr[st]=arr[en];
            arr[en]=temp;
            st++;
            en--;
        }
        return arr;
    }
}
