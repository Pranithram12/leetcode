public class customSortString {
    public String customSortString(String order, String str) {
        
        StringBuilder s1 = new StringBuilder(); 
        StringBuilder s2 = new StringBuilder();  

        
        int[] a = new int[26];

        
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            a[c - 'a']++;
        }

        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
           
            if (a[c - 'a'] == 0) {
                s2.append(c);
            } else {
                a[c - 'a']++;
            }
        }

        
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
           
            while (a[c - 'a'] > 1) {
                s1.append(c);
                a[c - 'a']--;
            }
        }

       
        return s1.toString() + s2.toString();
    }
}
