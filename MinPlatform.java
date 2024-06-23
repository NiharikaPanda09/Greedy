import java.util.*;
public class MinPlatform {
    public static void main(String[] args) {
        int [] arr = {900, 940, 950, 1100, 1500, 1800};
        int [] dep = {910, 1200, 1120, 1130, 1900, 2000};
        int n = 6;
        int res = findPlatform(arr,dep,n);
        System.out.println(res);

    }
    public static int  findPlatform(int[] arr, int[] dep, int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int plat = 1;
        int max = 1;

        int i= 0;
        int j=1;
        while(j < arr.length){
            if(dep[i] >= arr[j]){
                plat += 1;
                max = Math.max(max,plat);
                j += 1;
            }
            else {
                i +=1;
                plat -= 1;
            }
        }
        return max;

    }
}
