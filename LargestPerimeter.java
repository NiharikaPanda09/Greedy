import java.util.*;
public class LargestPerimeter {
    public static void main(String[] args) {
      int [] nums = {2,1,2};
        System.out.println(largestPerimeter(nums));
    }
    public static int largestPerimeter(int[] nums) {
         Arrays.sort(nums);
         for(int i=nums.length-1;i>=2;i--){
             int c= nums[i];
             int b = nums[i-1];
             int a = nums[i-2];
             if(isValid(a,b,c)){
                 return a+b+c;
             }
         }
         return 0;
    }
    public static boolean isValid(int a , int b, int c){
           return a+b >c;
    }
}
