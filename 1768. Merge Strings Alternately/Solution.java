class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        int min=Math.min(len1,len2);
        String longer="";

        if(min == len1){
            longer=word2;
        }
        if(min == len2){
            longer=word1;
        }

        char char1[]=word1.toCharArray();
        char char2[]=word2.toCharArray();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<min;i++){
            sb.append(char1[i]);
            sb.append(char2[i]);
        }

        sb.append(longer.substring(min));

        return sb.toString();
    }
}
