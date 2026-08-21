import java.util.*;

public class Easy4{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] nums=new int[n];
       for(int i=0;i<n;i++){
           nums[i]=in.nextInt();
       }
       System.out.println(removedup(nums));
      System.out.println(removedup2(nums));
    }
  static int removedup(int[] arr){
        int key=0;
        int count=1;
        int swap=1;
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                key=arr[i+1];
            }
            j=i+1;
            while(arr[j]==key){
                j++;
            }
            if(arr[j]!=key){
                key=arr[j];
                count++;
                int temp=arr[swap];
                arr[swap]=arr[j];
                arr[j]=temp;
            }
            swap++;
            i=j;
        }
        System.out.println(Arrays.toString(arr));
        return count;
    }
    static int remdup2(int[] arr){
        int key=arr[0];
        int swaps=0;
        for(int i=1;i<arr.length-1;i++){
            while(arr[i]<=key){
                break;
            }
             if(arr[i]>key){
                swaps++;
                int temp=arr[swaps];
                arr[swaps]=arr[i];
                arr[i]=temp;
                key=arr[swaps];
            }
        }
        System.out.println(Arrays.toString(arr));
        return swaps+1;
    }
}
