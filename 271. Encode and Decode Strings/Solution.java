import java.util.*;

public class Codec {
    private static final char DELIMITER = '#';

    public String encode(List<String> strs) {
        if (strs == null || strs.isEmpty()) return "";

        StringBuilder encoded = new StringBuilder();
        for (String s : strs) {
            encoded.append(s.length());
            encoded.append(DELIMITER);
            encoded.append(s);
        }
        return encoded.toString();
    }

    public List<String> decode(String s) {
        List<String> decoded = new ArrayList<>();
        if (s == null || s.isEmpty()) return decoded;

        int i = 0;
        while (i < s.length()) {
            int slash = s.indexOf(DELIMITER, i);
            if (slash == -1) break;
            int length = Integer.parseInt(s.substring(i, slash));
            i = slash + 1 + length;
            decoded.add(s.substring(slash + 1, i));
        }

        return decoded;
    }
}
