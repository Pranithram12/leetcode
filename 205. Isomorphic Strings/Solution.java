class Solution {
    public boolean isIsomorphic(String s, String t) {


        Map<Character,Character> charmappingmap=new HashMap<>();

        for(int i=0; i<s.length() ;i++){

            char original=s.charAt(i);
            char replacement=t.charAt(i);

            if(!charmappingmap.containsKey(original)){
                if(!charmappingmap.containsValue(replacement)){
                    charmappingmap.put(original,replacement);
                }
                else{
                    return false;
                }
            }
            else{
                char mappedchar=charmappingmap.get(original);
                if(mappedchar != replacement){
                    return false;
                }
            }
        }

        return true;
    }
}