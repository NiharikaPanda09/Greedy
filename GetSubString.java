import java.util.*;
public class GetSubString {
    public static void main(String[] args) {
          String s = "abcd";
          String t = "acde";
          int max = 0;
          int res = equalSubstring(s,t,max);
        System.out.println(res);
    }
    public static  int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
          int left =0;
          int window = 0;
          int ans =0;
          for(int right=0; right<n ;right++){
              window += Math.abs(s.charAt(right)- t.charAt(left));
              while(window>maxCost){
                  window-= Math.abs(s.charAt(left) - t.charAt(left));
                  left++;
              }
              ans= Math.max(ans,right-left+1);

          }
          return ans;
    }
}
