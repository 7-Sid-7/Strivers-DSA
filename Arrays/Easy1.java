import java.util.Scanner;
public class Easy1{
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
    }
    System.out.println(largestElement(arr));
  }
  static int largestElement(int[] nums){
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
}
