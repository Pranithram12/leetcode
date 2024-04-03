class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int start=0;
        int end=s.length() - 1;
        String vowels="aeiouAEIOU";

        while(start < end){

            while(start < end){                   //it will check from starting is there any vowels
                char ch=arr[start];
                if(vowels.indexOf(ch) != -1){
                    break;
                }
                start++;
            }


             while(start < end){                  //it will check from end is there any vowels
                char ch=arr[end];
                if(vowels.indexOf(ch) != -1){
                    break;
                }
                end--;
            }

            char temp=arr[start];                 //if there any vowels from starting and ending it wil reverse them.
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        return new String(arr);
    }
}