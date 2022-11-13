package com.lanshan;

import java.util.Scanner;

class homework11{
        public int[] twoSum(int[] nums,int target){
                int[] rst = new int[2];
                int len = nums.length;

                for(int i = 0; i < len - 1;i++){
                        for(int j = i + 1;j < len;j++){
                                if(nums[i] + nums[j] == target){
                                        rst[0] = i;
                                        rst[1] = j;
                                        return rst;
                                }
                        }
                }
                return  rst;
        }
}