import java.util.Arrays;

public class _14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int idx = 0;

        if(strs.length == 0) {
            return "";
        }

        while(idx < first.length()) {
            if(first.charAt(idx) == last.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }

        if(idx == 0) {
            return "";
        }
        return first.substring(0, idx);
    }
}
