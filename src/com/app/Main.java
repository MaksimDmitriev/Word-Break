package com.app;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("aaa");
        boolean res = solution.wordBreak("aaaaaaa", list);
        System.out.println(res);
    }
}
