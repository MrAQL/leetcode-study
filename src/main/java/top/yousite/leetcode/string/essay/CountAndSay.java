package top.yousite.leetcode.string.essay;

public class CountAndSay {
    /**
     * 38. 报数
     */
    public String countAndSay(int n) {
        String[] dp = new String[n];
        dp[0]="1";
        for (int i = 1; i < n; i++) {
            StringBuilder res = new StringBuilder();
            for (int j = 0; j < dp[i-1].length(); j++) {
                int k =j;
                while (k<dp[i-1].length()-1 && dp[i-1].charAt(k) == dp[i-1].charAt(k+1)){
                    k++;
                }
                res.append((k-j+1)+"");
                res.append(dp[i-1].charAt(k));
                j=k;
            }
            dp[i]=String.valueOf(res);
        }
        return dp[n-1];
    }
}
