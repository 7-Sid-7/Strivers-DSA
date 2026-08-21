import java.util.*;

public class Easy10{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] nums=new int[n];
       for(int i=0;i<n;i++){
           nums[i]=in.nextInt();
       }
       System.out.println(missing(nums));
       System.out.println(missing1(nums));
       System.out.println(missing2(nums));      
    }
    static int missing(int[] arr){
        int n=arr.length+1;
        int[] hash=new int[n+1];
        for(int i:arr){
            hash[i]=1;
        }
        for(int i=1;i<hash.length;i++){
            if(hash[i]==0){
                return i;
            }
        }
        return -1;
    }
    static int missing1(int[] arr){
        int n=arr.length+1;
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        long expsum=n*(n+1)/2;
        return (int)(expsum-sum);
    }
    static int missing2(int[] arr){
        int xor1=0;
        int xor2=0;
        for(int i:arr){
            xor1^=i;
        }
        for(int i=1;i<=arr.length+1;i++){
            xor2^=i;
        }
        return xor1^xor2;
    }
}
