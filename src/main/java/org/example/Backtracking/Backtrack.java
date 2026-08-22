package org.example.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Backtrack {
    static List<List<Integer>> result = new ArrayList<>();
public static void main(String args[]){
    int[] nums={4,5,6};
    backtrack(nums, 0, new ArrayList<>());
    System.out.println("final result:::"+result);
}

    static void backtrack(int[] nums, int start, List<Integer> current) {
       // result.add(new ArrayList<>(current)); // every state along the way IS a valid subset
       // System.out.println("inside loop"+result);
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
        }
        System.out.println("inside current list"+current);

        for (int i = 0; i < nums.length; i++) {
            System.out.println("loop started with"+i);
            if(current.size()!=nums.length){
                continue;
            }
            current.add(nums[i]);              // choose
            backtrack(nums, i + 1, current);
            System.out.println("removing " + current.get(current.size() - 1));
            current.remove(current.size() - 1); // un-choose (backtrack)
        }
    }
}
