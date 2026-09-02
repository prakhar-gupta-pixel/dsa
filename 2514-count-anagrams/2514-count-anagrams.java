class Solution {

    static final long MOD = 1_000_000_007L;

    // Modular exponentiation
    long power(long a, long b) {
        long result = 1;

        while (b > 0) {
            if ((b & 1) == 1) {
                result = result * a % MOD;
            }

            a = a * a % MOD;
            b >>= 1;
        }

        return result;
    }

    // Modular inverse using Fermat's theorem
    long modInverse(long x) {
        return power(x, MOD - 2);
    }

    public int countAnagrams(String s) {

        int n = s.length();

        // factorial[i] = i! % MOD
        long[] factorial = new long[n + 1];
        factorial[0] = 1;

        for (int i = 1; i <= n; i++) {
            factorial[i] = factorial[i - 1] * i % MOD;
        }

        long answer = 1;

        int i = 0;

        while (i < n) {

            // Frequency of characters in current word
            int[] freq = new int[26];

            int j = i;

            while (j < n && s.charAt(j) != ' ') {
                freq[s.charAt(j) - 'a']++;
                j++;
            }

            int length = j - i;

            // Start with length!
            long ways = factorial[length];

            // Divide by frequency factorials
            for (int f : freq) {
                if (f > 1) {
                    ways = ways * modInverse(factorial[f]) % MOD;
                }
            }

            // Multiply ways for this word
            answer = answer * ways % MOD;

            // Move to next word
            i = j + 1;
        }

        return (int) answer;
    }
}