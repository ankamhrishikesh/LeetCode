import java.util.Arrays;

class Solution {
    public boolean canConstruct(String str, int k) {
        if (str.length() < k) return false;

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        int odd = 0;

        for (int i = 0; i < chars.length; ) {
            char current = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }
            if (count % 2 != 0) odd++;
        }

        return odd <= k;
    }
}