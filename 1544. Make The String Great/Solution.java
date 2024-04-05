class Solution {
    public String makeGood(String s) {
        StringBuilder ans=new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            int len = ans.length();
            if(len > 0 && Math.abs(ans.charAt(len-1) - ch) == 32){
                ans.deleteCharAt(len-1);
            }
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}