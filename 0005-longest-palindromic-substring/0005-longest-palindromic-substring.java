
class Solution {

    public String longestPalindrome(String s) {

        int start = 0;
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            int left = i;
            int right = i;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {

                left--;
                right++;
            }

            int len = right - left - 1;

            if (len > maxLen) {
                start = left + 1;
                maxLen = len;
            }

            // Even length palindrome
            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {

                left--;
                right++;
            }

            len = right - left - 1;

            if (len > maxLen) {
                start = left + 1;
                maxLen = len;
            }
        }

        return s.substring(start, start + maxLen);
    }
}

