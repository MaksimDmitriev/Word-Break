package com.app;

import java.util.List;

public class Solution {

    public boolean wordBreak(String s, List<String> dict) {
        boolean[] f = new boolean[s.length() + 1];
        f[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                String str = s.substring(j, i);
                if (f[j] && dict.contains(str)) {
                    f[i] = true;
                    break;
                }
            }
        }

        return f[s.length()];
    }

}
